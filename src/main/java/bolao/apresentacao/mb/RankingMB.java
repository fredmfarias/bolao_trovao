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

@ManagedBean(name="rankingMB")
@ViewScoped
public class RankingMB implements Serializable{

	private static final long serialVersionUID = 5625930020936938728L;

	private List<Ranking> rankings;
	private List<Integer> parciais;
	private int parcial;

	@ManagedProperty(value="#{rankingService}")
	private IRankingService rankingService;
	
	@PostConstruct
	public void init(){
		try{
			//this.parciais = this.rankingService.buscarParciais();
			this.rankings = this.rankingService
								.buscarRankingPorParcial(
										this.rankingService.ultimaParcialPostada());
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0014");
		}
	}
	
	public void buscaRanking(){
		try {
			this.rankings = this.rankingService
					.buscarRankingPorParcial(parcial);
		} catch (RankingException e) {
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0014");
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

	public List<Integer> getParciais() {
		return parciais;
	}

	public void setParciais(List<Integer> parciais) {
		this.parciais = parciais;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public int getParcial() {
		return parcial;
	}

	public void setParcial(int parcial) {
		this.parcial = parcial;
	}
}
