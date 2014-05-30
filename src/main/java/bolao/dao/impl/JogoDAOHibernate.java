package bolao.dao.impl;

import org.springframework.stereotype.Repository;

import bolao.dao.JogoDAO;
import bolao.model.Jogo;

@Repository("jogoDAO")
public class JogoDAOHibernate extends GenericHibernate<Jogo> implements JogoDAO {

	@Override
	protected Class<Jogo> getEntityClass() {
		return Jogo.class;
	}

}
