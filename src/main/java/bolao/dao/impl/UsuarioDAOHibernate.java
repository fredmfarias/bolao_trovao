package bolao.dao.impl;

import org.hibernate.Query;

import bolao.dao.UsuarioDAO;
import bolao.model.Usuario;

public class UsuarioDAOHibernate extends GenericHibernate<Usuario> implements UsuarioDAO {

	@Override
	protected Class<Usuario> getEntityClass() {
		return Usuario.class;
	}

	@Override
	public Long countLogin(String login) {
		String hql = "SELECT COUNT(DISTINCT u.login) FROM Usuario u WHERE u.login = :login";
		
		Query consulta = super.getSession().createQuery(hql);
		
		consulta.setString("login", login);
		
		return (Long) consulta.uniqueResult();
	}
}
