package bolao.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import bolao.dao.ClubeDAO;
import bolao.model.Clube;

@Repository("clubeDAO")
public class ClubeDAOHibernate extends GenericHibernate<Clube> implements ClubeDAO, Serializable {

	private static final long serialVersionUID = -1818212374793408264L;

	protected Class<Clube> getEntityClass() {
		return Clube.class;
	}
}
