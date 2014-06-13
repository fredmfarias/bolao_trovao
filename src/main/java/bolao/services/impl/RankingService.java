package bolao.services.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bolao.model.Aposta;
import bolao.model.Ranking;
import bolao.services.IRankingService;
import bolao.util.Constantes;

@Transactional(readOnly = true)
@Service("rankingService")
public class RankingService implements IRankingService {

	@Override
	public Ranking geraRankingUsuario(List<Aposta> apostas) {
		
		Ranking ranking = new Ranking();
		
		for(Aposta a : apostas){
			
			ranking.addPontuacao(a.getPontuacao());
			
			if ((a.getPontuacao() == Constantes.PONTUACAO_AP) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_AP * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosPlacarJogo();
			}else if((a.getPontuacao() == Constantes.PONTUACAO_APG) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_APG * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosPlacarVencedorJogo();
			}else if((a.getPontuacao() == Constantes.PONTUACAO_APP) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_APP * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosPlacarPerdedorJogo();
			}else if((a.getPontuacao() == Constantes.PONTUACAO_AE) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_AE * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosEmpateJogo();
			}else if((a.getPontuacao() == Constantes.PONTUACAO_AG) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_AG * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosGanhador();
			}else if((a.getPontuacao() == Constantes.PONTUACAO_AN) || 
					(a.getPontuacao() == (Constantes.PONTUACAO_AN * a.getJogo().getPesoPontucao()))){
				ranking.addAcertosNada();
			}
			
			ranking.setUsuario(a.getUsuario());
		}
		
		return ranking;
	}

	@Override
	public void geraPosicaoRanking(List<Ranking> rankings) {
		Collections.sort(rankings);
		
		for(int i=0; i<rankings.size(); i++){
			rankings.get(i).setPosicao(i+1);
		}
	}
}