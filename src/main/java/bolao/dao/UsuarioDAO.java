package bolao.dao;

import bolao.model.Usuario;

public interface UsuarioDAO extends DAOBase<Usuario>{
	public Long countLogin(String login);
}
