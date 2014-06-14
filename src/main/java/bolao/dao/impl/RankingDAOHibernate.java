package bolao.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import bolao.dao.RankingDAO;
import bolao.model.Ranking;
import bolao.model.Usuario;

@Repository("rankingDAO")
public class RankingDAOHibernate extends GenericHibernate<Ranking> implements RankingDAO, Serializable {

	private static final long serialVersionUID = 8841812347453468238L;

	@Override
	public Integer maxParcialPostada() {
		String hql = "SELECT MAX(parcialPostada) FROM Ranking r";
		
		Query consulta = super.getSession().createQuery(hql);
				
		return (Integer) consulta.uniqueResult();
	}

	@Override
	protected Class<Ranking> getEntityClass() {
		return Ranking.class;
	}

	@Override
	public Integer posicaoRanking(int parcial, Usuario usuario) {
		String hql = "SELECT posicao FROM Ranking r WHERE "
				+ "r.usuario.id = :usuario AND r.parcialPostada = :parcial ";
		
		Query consulta = super.getSession().createQuery(hql);
		
		consulta.setLong("usuario", usuario.getId());
		consulta.setInteger("parcial", parcial);
		
		return (Integer) consulta.uniqueResult();
	}

	@Override
	public List<Ranking> buscarRankingPorParcial(int parcial) {
		String hql = "FROM Ranking r WHERE r.parcialPostada = :parcial";
		
		Query consulta = super.getSession().createQuery(hql);
		
		consulta.setInteger("parcial", parcial);
		
		return consulta.list();
	}

	@Override
	public List<Integer> buscarParciais() {
		String hql = "SELECT DISTINCT(r.parcialPostada) FROM Ranking r "
				+ "ORDER BY r.parcialPostada";
		
		Query consulta = super.getSession().createQuery(hql);
		
		return consulta.list();
	}
}