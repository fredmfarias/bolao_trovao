package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bolao.model.Clube;
import bolao.model.Estadio;
import bolao.model.Jogo;
import bolao.services.IClubeService;
import bolao.services.IEstadioService;
import bolao.services.IJogoService;
import bolao.util.MessagesProperty;

@ManagedBean(name="adcionarJogoMB")
@ViewScoped
public class AdcionarJogoMB implements Serializable {

	private static final long serialVersionUID = -553372748571417710L;

	private Jogo jogo;
	
	@ManagedProperty(value="#{jogoService}")
	private IJogoService jogoService;
	
	@ManagedProperty(value="#{clubeService}")
	private IClubeService clubeService;

	@ManagedProperty(value="#{estadioService}")
	private IEstadioService estadioService;
	
	private Clube clubeSelecionadoCasa;
	private Clube clubeSelecionadoVisitante;
	
	private List<Clube> clubes;
	
	private List<Estadio> estadios;
	
	@PostConstruct
	public void init(){
		try{
			this.jogo = new Jogo();
			this.clubes = this.clubeService.getAllClubes();
			this.estadios = this.estadioService.getAllEstadios();
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0018");
		}
	}
	
	public void salvar(){
		try{
			
			this.jogoService.adcionaJogo(jogo);
			
			MessagesProperty.sucessoMsg("MN0001");
		}catch(Throwable e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0019");
		}
	}

	public Jogo getJogo() {
		return jogo;
	}

	public void setJogo(Jogo jogo) {
		this.jogo = jogo;
	}

	public IJogoService getJogoService() {
		return jogoService;
	}

	public void setJogoService(IJogoService jogoService) {
		this.jogoService = jogoService;
	}

	public Clube getClubeSelecionadoCasa() {
		return clubeSelecionadoCasa;
	}

	public void setClubeSelecionadoCasa(Clube clubeSelecionadoCasa) {
		this.clubeSelecionadoCasa = clubeSelecionadoCasa;
	}

	public Clube getClubeSelecionadoVisitante() {
		return clubeSelecionadoVisitante;
	}

	public void setClubeSelecionadoVisitante(Clube clubeSelecionadoVisitante) {
		this.clubeSelecionadoVisitante = clubeSelecionadoVisitante;
	}

	public List<Clube> getClubes() {
		return clubes;
	}

	public void setClubes(List<Clube> clubes) {
		this.clubes = clubes;
	}

	public IClubeService getClubeService() {
		return clubeService;
	}

	public void setClubeService(IClubeService clubeService) {
		this.clubeService = clubeService;
	}
	
	public IEstadioService getEstadioService() {
		return estadioService;
	}
	
	public void setEstadioService(IEstadioService estadioService) {
		this.estadioService = estadioService;
	}

	public List<Estadio> getEstadios() {
		return estadios;
	}

	public void setEstadios(List<Estadio> estadios) {
		this.estadios = estadios;
	}
	
}
