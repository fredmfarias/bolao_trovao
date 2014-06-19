package bolao.services;

import java.util.List;

import bolao.excecoes.RankingException;
import bolao.model.Jogo;
import bolao.model.RankingDetalhado;

public interface IRankingDetalhadoService {
	List<RankingDetalhado> geraRankingDetalhado(List<Jogo> jogos) throws RankingException;
	void salvarRankingDetalhado(List<RankingDetalhado> rankings) throws RankingException;
	int ultimaParcialPostada() throws RankingException;
	List<RankingDetalhado> buscarRankingDetalhadoPorParcial(int parcial) throws RankingException;
	List<Integer> buscarParciais() throws RankingException;
}
