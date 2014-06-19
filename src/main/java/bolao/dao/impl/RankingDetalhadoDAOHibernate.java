package bolao.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import bolao.dao.RankingDetalhadoDAO;
import bolao.model.RankingDetalhado;
import bolao.model.Usuario;

@Repository("rankingDetalhadoDAO")
public class RankingDetalhadoDAOHibernate extends GenericHibernate<RankingDetalhado> implements RankingDetalhadoDAO, Serializable {

	private static final long serialVersionUID = -4518503763122461171L;

	@Override
	public Integer maxParcialPostada() {
		String hql = "SELECT MAX(parcialPostada) FROM RankingDetalhado r";
		
		Query consulta = super.getSession().createQuery(hql);
				
		return (Integer) consulta.uniqueResult();
	}

	@Override
	protected Class<RankingDetalhado> getEntityClass() {
		return RankingDetalhado.class;
	}

	@Override
	public Integer posicaoRankingDetalhado(int parcial, Usuario usuario) {
		String hql = "SELECT posicao FROM RankingDetalhado r WHERE "
				+ "r.usuario.id = :usuario AND r.parcialPostada = :parcial ";
		
		Query consulta = super.getSession().createQuery(hql);
		
		consulta.setLong("usuario", usuario.getId());
		consulta.setInteger("parcial", parcial);
		
		return (Integer) consulta.uniqueResult();
	}

	@Override
	public List<RankingDetalhado> buscarRankingDetalhadoPorParcial(int parcial) {
		String hql = "FROM RankingDetalhado r WHERE r.parcialPostada = :parcial";
		
		Query consulta = super.getSession().createQuery(hql);
		
		consulta.setInteger("parcial", parcial);
		
		return consulta.list();
	}

	@Override
	public List<Integer> buscarParciais() {
		String hql = "SELECT DISTINCT(r.parcialPostada) FROM RankingDetalhado r "
				+ "ORDER BY r.parcialPostada";
		
		Query consulta = super.getSession().createQuery(hql);
		
		return consulta.list();
	}
}