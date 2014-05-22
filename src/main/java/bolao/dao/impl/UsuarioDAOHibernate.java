package bolao.dao.impl;

import bolao.dao.UsuarioDAO;
import bolao.model.Usuario;

public class UsuarioDAOHibernate extends GenericHibernate<Usuario> implements UsuarioDAO {

	@Override
	protected Class<Usuario> getEntityClass() {
		return Usuario.class;
	}
	
}
