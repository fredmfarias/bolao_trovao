package bolao.services;

import java.util.List;

import bolao.excecoes.UsuarioException;
import bolao.model.Usuario;

public interface IUsuarioService {
	void addUsuario(Usuario usuario) throws UsuarioException;
	boolean existeLogin(String login);
	Usuario buscaUsuarioParaSessao(String login) throws UsuarioException;
	List<Usuario> getAllUsuarios();
	void atualizaUsuario(Usuario usuario) throws UsuarioException;
}
