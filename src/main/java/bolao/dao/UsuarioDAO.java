package bolao.dao;

import bolao.model.Usuario;

public interface UsuarioDAO extends DAOBase<Usuario>{
	Long countLogin(String login);
	Long buscaIdUsuarioPorLogin(String login);
}
