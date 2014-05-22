package bolao.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import bolao.dao.DAOBase;


public abstract class GenericHibernate<T> implements DAOBase<T> {
	
	private SessionFactory sessionFactory;
	
	protected abstract Class<T> getEntityClass();	
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}
	
	public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
	
	protected Session getSession() {
		return getSessionFactory().getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<T> listAll() {
		return (List<T>) getSession().createCriteria(getEntityClass()).list();
	}

	@Override
	public void salvar(T objeto) {
		getSession().save(objeto);		
	}

	@Override
	public void atualizar(T objeto) {
		getSession().update(objeto);		
	}

	@Override
	public void excluir(T objeto) {
		getSession().delete(objeto);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public T getOne(Long id) {
		return (T) getSession().get(getEntityClass(), id);
	}
}
