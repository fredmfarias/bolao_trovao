package bolao.services;

import java.util.List;

import bolao.excecoes.RankingException;
import bolao.model.Ranking;
import bolao.model.Usuario;

public interface IRankingService {
	List<Ranking> geraRankingGeral() throws RankingException;
	void salvarRanking(List<Ranking> rankings) throws RankingException;
	int ultimaParcialPostada() throws RankingException;
	List<Ranking> buscarRankingPorParcial(int parcial) throws RankingException;
	List<Integer> buscarParciais() throws RankingException;
	List<Ranking> buscarRankingPorUsuario(Usuario usuario, int parcial) throws RankingException;
	void colocaUsuarioNoRankingInicial(Usuario usuario) throws RankingException;
}
