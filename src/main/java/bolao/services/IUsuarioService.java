package bolao.services;

import bolao.excecoes.UsuarioException;
import bolao.model.Usuario;

public interface IUsuarioService {
	void addUsuario(Usuario usuario) throws UsuarioException;
	boolean existeLogin(String login);
	Usuario buscaUsuarioParaSessao(String login) throws UsuarioException;
}
