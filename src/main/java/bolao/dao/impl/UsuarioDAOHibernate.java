package bolao.dao.impl;

import org.hibernate.Session;

import bolao.dao.UsuarioDAO;
import bolao.model.Usuario;

public class UsuarioDAOHibernate implements UsuarioDAO {
	private Session session;
	
	public UsuarioDAOHibernate(Session session) {
		this.session = session;
	}
	
	@Override
	public void salvar(Usuario usuario) {
		this.session.save(usuario);
	}

}
