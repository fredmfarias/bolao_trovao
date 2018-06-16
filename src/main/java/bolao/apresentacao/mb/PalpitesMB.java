package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bolao.dto.PalpiteDTO;
import bolao.model.Jogo;
import bolao.services.IApostaService;
import bolao.services.IJogoService;
import bolao.util.MessagesProperty;

@ManagedBean(name="palpitesMB")
@ViewScoped
public class PalpitesMB extends MB implements Serializable{

	private static final long serialVersionUID = -7068041997771972770L;
	
	private List<PalpiteDTO> palpites;
	private List<Jogo> jogos;
	private Jogo jogoSelecionado;
	
	@ManagedProperty(value="#{apostaService}")
	private IApostaService apostaService;
	
	@ManagedProperty(value="#{jogoService}")
	private IJogoService jogoService;
	
	@PostConstruct
	public void init(){
		try{
			this.jogos = this.jogoService.buscaTodosJogosExibiveis();
			this.jogoSelecionado = this.jogos.isEmpty() ? null : this.jogos.get(0);
			this.buscaApostasJogo();
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0014");
		}
	}
		
	public void buscaApostasJogo(){
		try{
			this.palpites = this.apostaService
					.buscaPalpitesPorJogo(this.jogoSelecionado);
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0007");
		}
	}
	
	public List<Jogo> getJogos() {
		return this.jogos;
	}

	public void setParciais(List<Jogo> jogos) {
		this.jogos = jogos;
	}

	public Jogo getJogoSelecionado() {
		return jogoSelecionado;
	}
	
	public void setJogoSelecionado(Jogo jogoSelecionado) {
		this.jogoSelecionado = jogoSelecionado;
	}
	
	public List<PalpiteDTO> getPalpites() {
		return palpites;
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
