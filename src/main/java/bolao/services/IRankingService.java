package bolao.services;

import java.util.List;

import bolao.model.Aposta;
import bolao.model.Ranking;

public interface IRankingService {
	Ranking geraRankingUsuario(List<Aposta> apostas);
	void geraPosicaoRanking(List<Ranking> rankings);
}
