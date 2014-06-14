package bolao.dao;

import java.util.List;

import bolao.model.Ranking;
import bolao.model.Usuario;

public interface RankingDAO extends DAOBase<Ranking> {
	Integer maxParcialPostada();
	Integer posicaoRanking(int parcial, Usuario usuario);
	List<Ranking> buscarRankingPorParcial(int parcial);
	List<Integer> buscarParciais();
}
