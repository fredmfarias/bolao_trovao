package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bolao.excecoes.JogoException;
import bolao.model.Jogo;
import bolao.services.IJogoService;
import bolao.util.MessagesProperty;

@ManagedBean(name="jogoMB")
@ViewScoped
public class JogoMB extends MB implements Serializable{
			
	private static final long serialVersionUID = 3402219760355111859L;

	@ManagedProperty(value="#{jogoService}")
	private IJogoService jogoService;
	
	private List<Jogo> jogos;
		
	private List<Jogo> jogosFiltrados;
	
	private Jogo jogoSelecionado;
	
	public List<Date> datas;
		
	@PostConstruct
	public void init(){
		try{
		this.jogos = this.jogoService.getAllJogos();
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0014");
		}
	}
	
	public void atualizaPlacar(){
		try {
			this.jogoService.atualizaJogo(jogoSelecionado);
			MessagesProperty.sucessoMsg("MN0001");
		} catch (JogoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0015", e.getMessage());
		}
	}
	
	public IJogoService getJogoService() {
		return jogoService;
	}

	public void setJogoService(IJogoService jogoService) {
		this.jogoService = jogoService;
	}

	public List<Jogo> getJogos() {
		return jogos;
	}

	public void setJogos(List<Jogo> jogos) {
		this.jogos = jogos;
	}

	public List<Jogo> getJogosFiltrados() {
		return jogosFiltrados;
	}

	public void setJogosFiltrados(List<Jogo> jogosFiltrados) {
		this.jogosFiltrados = jogosFiltrados;
	}

	public Jogo getJogoSelecionado() {
		return jogoSelecionado;
	}

	public void setJogoSelecionado(Jogo jogoSelecionado) {
		this.jogoSelecionado = jogoSelecionado;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	public List<Date> getDatas(){
		if(this.datas == null){
			this.datas = this.jogoService.getAllDatasJogos(); 
		}
		
		return this.datas;
	}
}