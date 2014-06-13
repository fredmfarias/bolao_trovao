package bolao.services.impl;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import bolao.dao.JogoDAO;
import bolao.dao.UsuarioDAO;
import bolao.excecoes.UsuarioException;
import bolao.model.Usuario;
import bolao.services.IApostaService;
import bolao.services.IBolaoService;
import bolao.services.IUsuarioService;
import bolao.util.Constantes;

@Transactional(readOnly = true)
@Service("usuarioService")
public class UsuarioService implements IUsuarioService, Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 7592047598648932947L;

	@Autowired
	private UsuarioDAO usuarioDAO;
	
	@Autowired
	private JogoDAO jogoDAO;
	
	@Autowired
	private IApostaService apostaService;
	
	@Autowired
	private IBolaoService bolaoService;
	
	@Override
	@Transactional(readOnly = false)
	public void addUsuario(Usuario usuario) throws UsuarioException {
		
		try {
			validaUsuarioBase(usuario);
		} catch (UsuarioException e) {
			throw e;
		}
		
		if(!this.bolaoService.permiteAposta()){
			throw new UsuarioException("Prazo de cadastro de usuário ultrapassado.");
		}
						
		String senhaCriptografada = DigestUtils
										.md5DigestAsHex(usuario.getSenha().getBytes());
		
		usuario.setAtivo(true);
		usuario.setSenha(senhaCriptografada);
		usuario.addPermissao(Constantes.ROLE_USUARIO);
		
		try{
			this.usuarioDAO.salvar(usuario);
				
			apostaService.addAposta(usuario, this.jogoDAO.listAll());
		}
		catch (Exception e) {
			throw new UsuarioException("Erro ao adcionar Usuario", e);
		}
	}
	
	public boolean existeLogin(String login){
		return this.usuarioDAO.countLogin(login) > 0;
	}
	
	public void validaUsuarioBase(Usuario usuario) throws UsuarioException{
		
		if(usuario == null)
			throw new UsuarioException("Usuário nulo");
		
		if(usuario.getNome() == null)
			throw new UsuarioException("Nome de usuário não pode ser nulo");
		
		if(usuario.getEmail() == null)
			throw new UsuarioException("Email de usuário não pode ser nulo");
		
		if(usuario.getLogin() == null)
			throw new UsuarioException("Login de usuário não pode ser nulo");
		
		if(usuario.getSenha() == null)
			throw new UsuarioException("Senha de usuário não pode ser nulo");
		
		if(usuario.getTelefone() == null)
			throw new UsuarioException("Telefone de usuário não pode ser nulo");		
	}

	@Override
	public Usuario buscaUsuarioParaSessao(String login) throws UsuarioException {
		Long id;
		try{
			id = this.usuarioDAO.buscaIdUsuarioPorLogin(login);
		}catch(Exception e){
			throw new UsuarioException("Erro de banco de dados", e);
		}
		
		if(id == null){
			throw new UsuarioException("Estranho! Nenhum usuario encontrado");
		}
		
		Usuario usuario = new Usuario();
		
		usuario.setId(id);
		usuario.setLogin(login);
		
		return usuario;
	}

	@Override
	public List<Usuario> getAllUsuarios() {
		return this.usuarioDAO.listaUsuariosPorPagamento();
	}

	@Override
	@Transactional(readOnly = false)
	public void atualizaUsuario(Usuario usuario) throws UsuarioException {
		try {
			this.usuarioDAO.atualizar(usuario);
		} catch (Exception e) {
			throw new UsuarioException("usuario nao atualizado");
		}		
	}

	@Override
	public List<Usuario> buscaUsuariosAtivos() throws UsuarioException {
		try {
			return this.usuarioDAO.listaUsuariosPorSituacao(true);
		} catch (Exception e) {
			throw new UsuarioException("Falha ao buscar usuários");
		}
	}
}
