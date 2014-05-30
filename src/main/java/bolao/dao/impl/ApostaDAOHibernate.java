package bolao.dao.impl;

import java.util.List;

import org.hibernate.Query;
import org.springframework.stereotype.Repository;

import bolao.dao.ApostaDAO;
import bolao.model.Aposta;

@Repository("apostaDAO")
public class ApostaDAOHibernate extends GenericHibernate<Aposta> implements ApostaDAO {

	@Override
	protected Class<Aposta> getEntityClass() {
		return Aposta.class;
	}

	@Override
	public List<Aposta> buscaApostasPorUsuario(Long id_usuario){
		String hql = "FROM Aposta a WHERE a.usuario.id = :id_usuario";
		
		Query consulta = super.getSession().createQuery(hql);
		
		consulta.setLong("id_usuario", id_usuario);
		
		return consulta.list();
	}

}