package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import bolao.excecoes.ApostaException;
import bolao.excecoes.JogoException;
import bolao.model.Aposta;
import bolao.services.IApostaService;
import bolao.services.IJogoService;
import bolao.util.MessagesProperty;
import bolao.util.PrimeFacesUtil;

@ManagedBean(name="apostaMB")
@ViewScoped
public class ApostaMB extends MB implements Serializable{
	
	private static final long serialVersionUID = -3719644829272321357L;
	
	@ManagedProperty(value="#{apostaService}")
	private IApostaService apostaService;
	
	@ManagedProperty(value="#{jogoService}")
	private IJogoService jogoService;
	
	private List<Aposta> apostas;
	
	private boolean permiteAposta;
	
	public List<Date> datas;
	
	public List<Aposta> apostasFiltradas;
	
	public List<String> palpitesPossiveis;
		
	@PostConstruct
	public void init(){
		try{
		this.apostas = this.apostaService
				.buscaApostasPorUsuario(getUsuarioLogado());
		this.palpitesPossiveis = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10");
		}catch(Exception e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0007");
		}
	}
	
	public void salvar(){
		if(faltaPreencherAposta()){
			PrimeFacesUtil.executeJavaScript("PF('dlg').show()");
		}else{
			atualizar();
		}
	}
	
	public void atualizar(){
		
		try {
			this.apostaService.salvaListAposta(this.apostas);
			
			FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Sucesso!", "Apostas realizadas!");
	         
	        RequestContext.getCurrentInstance().showMessageInDialog(message);
			
			MessagesProperty.sucessoMsg("MN0001");
		} catch (ApostaException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0011");
		}
	}
	
	public void atualizarAposta(Aposta aposta){
		try {
			
			this.apostaService.salva(aposta);
					
		} catch (ApostaException e) {
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0011");
		}
	}
	
	public List<Date> getDatas(){
		if(this.datas == null){
			this.datas = this.jogoService.getAllDatasJogos(); 
		}
		
		return this.datas;
	}

	private boolean faltaPreencherAposta(){
		for(Aposta a : this.apostas){
			if(a.getApostaPlacarCasa() == null || a.getApostaPlacarVisitante() == null){
				return true;
			}
		}
		return false;
	}
	
	public IApostaService getApostaService() {
		return apostaService;
	}

	public void setApostaService(IApostaService apostaService) {
		this.apostaService = apostaService;
	}

	public List<Aposta> getApostas() {
		return apostas;
	}

	public void setApostas(List<Aposta> apostas) {
		this.apostas = apostas;
	}
	
	public boolean permiteAposta(Aposta aposta){
		
		try {
			this.permiteAposta =  this.jogoService.permiteAposta(aposta.getJogo());
		} catch (JogoException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return this.permiteAposta;
	}
	
	public String cssAExibir(){
		return permiteAposta() ? "apostar" : "ranking";
	}

	public IJogoService getJogoService() {
		return jogoService;
	}

	public void setJogoService(IJogoService jogoService) {
		this.jogoService = jogoService;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public List<Aposta> getDatasFiltradas() {
		return apostasFiltradas;
	}

	public void setDatasFiltradas(List<Aposta> apostasFiltradas) {
		this.apostasFiltradas = apostasFiltradas;
	}
	
	public List<String> getPalpitesPossiveis() {
		return palpitesPossiveis;
	}
}