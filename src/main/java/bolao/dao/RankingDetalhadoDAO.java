package bolao.dao;

import java.util.List;

import bolao.model.RankingDetalhado;
import bolao.model.Usuario;

public interface RankingDetalhadoDAO extends DAOBase<RankingDetalhado> {
	Integer maxParcialPostada();
	Integer posicaoRankingDetalhado(int parcial, Usuario usuario);
	List<RankingDetalhado> buscarRankingDetalhadoPorParcial(int parcial);
	List<Integer> buscarParciais();
}
