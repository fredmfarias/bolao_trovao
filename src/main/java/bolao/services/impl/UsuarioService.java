package bolao.services.impl;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.DigestUtils;

import bolao.dao.UsuarioDAO;
import bolao.excecoes.BolaoException;
import bolao.model.Usuario;
import bolao.services.IUsuarioService;
import bolao.util.Constantes;

@Transactional(readOnly = true)
public class UsuarioService implements IUsuarioService {
	
	UsuarioDAO usuarioDAO;
	
	@Override
	@Transactional(readOnly = false)
	public void addUsuario(Usuario usuario) throws BolaoException {
		
		try {
			validaUsuarioBase(usuario);
		} catch (BolaoException e) {
			throw e;
		}
						
		String senhaCriptografada = DigestUtils
										.md5DigestAsHex(usuario.getSenha().getBytes());
		
		usuario.setSenha(senhaCriptografada);
		usuario.addPermissao(Constantes.ROLE_USUARIO);
		
		getUsuarioDAO().salvar(usuario);
	}
	
	public boolean existeLogin(String login){
		return getUsuarioDAO().countLogin(login) > 0;
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	public void validaUsuarioBase(Usuario usuario) throws BolaoException{
		
		if(usuario == null)
			throw new BolaoException("Usuário nulo");
		
		if(usuario.getNome() == null)
			throw new BolaoException("Nome de usuário não pode ser nulo");
		
		if(usuario.getEmail() == null)
			throw new BolaoException("Email de usuário não pode ser nulo");
		
		if(usuario.getLogin() == null)
			throw new BolaoException("Login de usuário não pode ser nulo");
		
		if(usuario.getSenha() == null)
			throw new BolaoException("Senha de usuário não pode ser nulo");
		
		if(usuario.getTelefone() == null)
			throw new BolaoException("Telefone de usuário não pode ser nulo");		
	}
}
