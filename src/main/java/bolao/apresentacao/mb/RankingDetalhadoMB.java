package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bolao.excecoes.RankingException;
import bolao.excecoes.UsuarioException;
import bolao.model.RankingDetalhado;
import bolao.services.IRankingDetalhadoService;
import bolao.util.MessagesProperty;

@ManagedBean(name="rankingDetalhadoMB")
@ViewScoped
public class RankingDetalhadoMB extends MB implements Serializable {
	
	private static final long serialVersionUID = -1277934680901455002L;
	
	private int parcialSelecionada;
	private List<Integer> parciais;
	private List<RankingDetalhado> rankings;
		
	@ManagedProperty(value="#{rankingDetalhadoService}")
	private IRankingDetalhadoService rankingDetalhadoService;
		
	@PostConstruct
	public void init(){
		try{
			this.parciais = this.rankingDetalhadoService.buscarParciais();
			this.rankings = this.rankingDetalhadoService.buscarRankingDetalhadoPorParcial(
					this.rankingDetalhadoService.ultimaParcialPostada());
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0014");
		}
	}
			
	public void buscaRanking(){
		try {
			this.rankings = this.rankingDetalhadoService
					.buscarRankingDetalhadoPorParcial(this.parcialSelecionada);
		} catch (RankingException e) {
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0014");
		}
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

	public int getParcialSelecionada() {
		return parcialSelecionada;
	}

	public void setParcialSelecionada(int parcialSelecionada) {
		this.parcialSelecionada = parcialSelecionada;
	}

	public List<Integer> getParciais() {
		return parciais;
	}

	public void setParciais(List<Integer> parciais) {
		this.parciais = parciais;
	}
	
public String estiloLinha(RankingDetalhado ranking) {
				
		try {
			if(ranking != null && ranking.getUsuario().getId().equals(
					getUsuarioLogado().getId())){
				return "background-usuario";
			}else {
				return null;
			}
			
		} catch (UsuarioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return null;
	}
}
