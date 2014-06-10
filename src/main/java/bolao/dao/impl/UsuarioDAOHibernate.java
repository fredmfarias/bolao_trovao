package bolao.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import bolao.dao.UsuarioDAO;
import bolao.model.Usuario;

@Repository("usuarioDAO")
public class UsuarioDAOHibernate extends GenericHibernate<Usuario> implements UsuarioDAO, Serializable {

	private static final long serialVersionUID = 4185339837422430569L;

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

	@Override
	public Long buscaIdUsuarioPorLogin(String login) {
		String hql = "SELECT u.id FROM Usuario u WHERE u.login = :login";
		
		Query consulta = super.getSession().createQuery(hql);
		
		consulta.setString("login", login);
		
		return (Long) consulta.uniqueResult();
	}

	@Override
	public List<Usuario> listaUsuariosPorPagamento() {
		String hql = "FROM Usuario u ORDER BY pago, nome";
		
		Query consulta = super.getSession().createQuery(hql);
		
		return consulta.list();
	}
}
