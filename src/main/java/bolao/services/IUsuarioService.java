package bolao.services;

import bolao.excecoes.BolaoException;
import bolao.model.Usuario;

public interface IUsuarioService {
	void addUsuario(Usuario usuario) throws BolaoException;
	boolean existeLogin(String login);
}
