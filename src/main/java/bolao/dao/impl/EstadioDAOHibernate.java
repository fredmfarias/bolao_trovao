package bolao.dao.impl;

import java.io.Serializable;

import org.springframework.stereotype.Repository;

import bolao.dao.EstadioDAO;
import bolao.model.Estadio;

@Repository("estadioDAO")
public class EstadioDAOHibernate extends GenericHibernate<Estadio> implements EstadioDAO, Serializable {

	private static final long serialVersionUID = 8155764539413981742L;

	protected Class<Estadio> getEntityClass() {
		return Estadio.class;
	}
}
