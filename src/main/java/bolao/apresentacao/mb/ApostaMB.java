package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import org.primefaces.context.RequestContext;

import bolao.excecoes.ApostaException;
import bolao.model.Aposta;
import bolao.services.IApostaService;
import bolao.util.DataUtil;
import bolao.util.MessagesProperty;
import bolao.util.PrimeFacesUtil;

@ManagedBean(name="apostaMB")
@ViewScoped
public class ApostaMB extends MB implements Serializable{
	
	private static final long serialVersionUID = -3719644829272321357L;
	
	@ManagedProperty(value="#{apostaService}")
	private IApostaService apostaService;
	
	private List<Aposta> apostas;
	
	private Boolean permiteAposta;
	
	@PostConstruct
	public void init(){
		try{
		this.apostas = this.apostaService
				.buscaApostasPorUsuario(getUsuarioLogado());
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
	
	public boolean permiteAposta(){
		if(this.permiteAposta == null){
			this.permiteAposta = !DataUtil.isDataAnterior(dataLimiteAposta());
		}
		return this.permiteAposta;
	}
	
	public String cssAExibir(){
		return permiteAposta() ? "apostar" : "ranking";
	}
}