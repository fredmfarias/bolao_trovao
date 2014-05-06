package bolao.util;

import bolao.dao.UsuarioDAO;
import bolao.dao.impl.UsuarioDAOHibernate;


public class DAOFactory {
	
	public static UsuarioDAO criarUsuarioDAO(){
		return new UsuarioDAOHibernate(HibernateUtil
					.getSessionFactory().getCurrentSession());
	}
}