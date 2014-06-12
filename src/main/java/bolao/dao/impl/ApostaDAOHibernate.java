package bolao.dao.impl;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import bolao.dao.ApostaDAO;
import bolao.model.Aposta;

@Repository("apostaDAO")
public class ApostaDAOHibernate extends GenericHibernate<Aposta> implements ApostaDAO, Serializable {

	private static final long serialVersionUID = 3208898506557074873L;

	@Override
	protected Class<Aposta> getEntityClass() {
		return Aposta.class;
	}

	@Override
	public List<Aposta> buscaApostasPorUsuario(Long id_usuario){
		String hql = "FROM Aposta a inner join fetch a.jogo j WHERE a.usuario.id = :id_usuario "
				+ "order by j.numeroJogo";
		
		Query consulta = super.getSession().createQuery(hql);
		
		consulta.setLong("id_usuario", id_usuario);
		
		return consulta.list();
	}

	@Override
	public List<Aposta> buscaAPostasPorJogo(Integer id_jogo) {
		String hql = "FROM Aposta a inner WHERE a.jogo.id = :id_jogo";
		
		Query consulta = super.getSession().createQuery(hql);
		
		consulta.setLong("id_jogo", id_jogo);
		
		return consulta.list();
	}
}
