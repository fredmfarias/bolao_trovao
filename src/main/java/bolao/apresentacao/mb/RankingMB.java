package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bolao.excecoes.RankingException;
import bolao.excecoes.UsuarioException;
import bolao.model.Aposta;
import bolao.model.Ranking;
import bolao.model.Usuario;
import bolao.services.IApostaService;
import bolao.services.IJogoService;
import bolao.services.IRankingService;
import bolao.util.MessagesProperty;

@ManagedBean(name="rankingMB")
@ViewScoped
public class RankingMB extends MB implements Serializable{

	private static final long serialVersionUID = 5625930020936938728L;

	private List<Ranking> rankings;
	private List<Integer> parciais;
	private int parcialSelecionada;
	private Usuario usuarioSelecionado; 
	
	private List<Aposta> apostas;
	private List<Date> datas;
	
	@ManagedProperty(value="#{rankingService}")
	private IRankingService rankingService;
	
	@ManagedProperty(value="#{apostaService}")
	private IApostaService apostaService;
	
	@ManagedProperty(value="#{jogoService}")
	private IJogoService jogoService;
	
	@PostConstruct
	public void init(){
		try{
			this.parciais = this.rankingService.buscarParciais();
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
					.buscarRankingPorParcial(this.parcialSelecionada);
		} catch (RankingException e) {
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0014");
		}
	}
	
	public void buscaApostasUsuario(){
		try{
			this.apostas = this.apostaService
					.buscaApostasUsuarioExibPorNumJogo(usuarioSelecionado);
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0007");
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
	
	public String estiloLinha(Ranking ranking) {
		
		switch (ranking.getPosicao()) {
		case 1:
			return "background-ouro";
		case 2:
			return "background-prata";
		case 3:
			return "background-bronze";
		}
		
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
	
	public String estiloVariacao(int variacao) {
		
		if(variacao == 0){
			return "permanece";
		}
		
		if(variacao > 0){
			return "crescente";
		}
		
		return "decrescente";
	}
	
	public List<Date> getDatas(){
		if(this.datas == null){
			this.datas = this.jogoService.getAllDatasJogos(); 
		}
		
		return this.datas;
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

	public int getParcialSelecionada() {
		return parcialSelecionada;
	}

	public void setParcialSelecionada(int parcialSelecionada) {
		this.parcialSelecionada = parcialSelecionada;
	}
	
	public List<Aposta> getApostas() {
		return apostas;
	}

	public void setApostas(List<Aposta> apostas) {
		this.apostas = apostas;
	}

	public void setDatas(List<Date> datas) {
		this.datas = datas;
	}

	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}

	public IApostaService getApostaService() {
		return apostaService;
	}

	public void setApostaService(IApostaService apostaService) {
		this.apostaService = apostaService;
	}

	public IJogoService getJogoService() {
		return jogoService;
	}

	public void setJogoService(IJogoService jogoService) {
		this.jogoService = jogoService;
	}
}
