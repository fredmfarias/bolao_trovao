package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bolao.excecoes.RankingException;
import bolao.model.Ranking;
import bolao.services.IRankingService;
import bolao.util.MessagesProperty;

@ManagedBean(name="controleRankingMB")
@ViewScoped
public class ControleRankingMB implements Serializable{

	private static final long serialVersionUID = 5625930020936938728L;

	List<Ranking> rankings;

	@ManagedProperty(value="#{rankingService}")
	private IRankingService rankingService;
	
	@PostConstruct
	public void init(){
		try{
			this.rankings = this.rankingService
								.buscarRankingPorParcial(
										this.rankingService.ultimaParcialPostada());
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0014");
		}
	}
	
	public void geraRanking(){
		try {
			this.rankings = this.rankingService.geraRankingGeral();
		} catch (RankingException e) {
			MessagesProperty.errorMsg("MN0016");
		}
	}
	
	public void publicarRanking(){
		try {
			this.rankingService.salvarRanking(rankings);
			MessagesProperty.sucessoMsg("MN0001");
		} catch (RankingException e) {
			MessagesProperty.errorMsg("MN0016");
		}
	}
	
	public List<Ranking> getRankings() {
		return rankings;
	}

	public void setRankings(List<Ranking> rankings) {
		this.rankings = rankings;
	}

	public IRankingService getRankingService() {
		return rankingService;
	}

	public void setRankingService(IRankingService rankingService) {
		this.rankingService = rankingService;
	}
	
	public String estiloLinha(int posicao) {
		
		switch (posicao) {
		case 1:
			return "background-ouro";
		case 2:
			return "background-prata";
		case 3:
			return "background-bronze";

		default:
			return null;
		}
	}
	
	public String estiloVariacao(int variacao) {
		
		if(variacao == 0){
			return "permanece";
		}
		
		if(variacao > 0){
			return "crescente";
		}
		
		return "decrescente";
	}
}
