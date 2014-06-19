package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bolao.excecoes.RankingException;
import bolao.model.Jogo;
import bolao.model.RankingDetalhado;
import bolao.services.IJogoService;
import bolao.services.IRankingDetalhadoService;
import bolao.util.MessagesProperty;

@ManagedBean(name="controleRankingDetalhadoMB")
@ViewScoped
public class ControleRankingDetalhadoMB implements Serializable {
	
	private static final long serialVersionUID = -1277934680901455002L;
	private List<Jogo> jogos;
	private List<Jogo> jogosSelecionados;
	private List<RankingDetalhado> rankings;
	
	@ManagedProperty(value="#{jogoService}")
	private IJogoService jogoService;
	
	@ManagedProperty(value="#{rankingDetalhadoService}")
	private IRankingDetalhadoService rankingDetalhadoService;
	
	@PostConstruct
	public void init(){
		try{
		this.jogos = this.jogoService.buscaTodosJogosComPlacar();
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0014");
		}
	}
	
	public void geraRankingDetalhado(){
		try {
			this.rankings = this.rankingDetalhadoService.geraRankingDetalhado(jogosSelecionados);
			System.out.println("opa");
		} catch (RankingException e) {
			MessagesProperty.errorMsg("MN0016");
		}
	}
	
	public List<Jogo> getJogos() {
		return jogos;
	}
	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}
	public List<Jogo> getJogosSelecionados() {
		return jogosSelecionados;
	}
	public void setJogosSelecionados(List<Jogo> jogosSelecionados) {
		this.jogosSelecionados = jogosSelecionados;
	}

	public IJogoService getJogoService() {
		return jogoService;
	}

	public void setJogoService(IJogoService jogoService) {
		this.jogoService = jogoService;
	}

	public IRankingDetalhadoService getRankingDetalhadoService() {
		return rankingDetalhadoService;
	}

	public void setRankingDetalhadoService(
			IRankingDetalhadoService rankingDetalhadoService) {
		this.rankingDetalhadoService = rankingDetalhadoService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<RankingDetalhado> getRankings() {
		return rankings;
	}

	public void setRankings(List<RankingDetalhado> rankings) {
		this.rankings = rankings;
	}
}
