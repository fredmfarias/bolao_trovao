package bolao.apresentacao.mb;

import java.util.Date;

import javax.faces.bean.ManagedProperty;

import bolao.excecoes.UsuarioException;
import bolao.model.Usuario;
import bolao.services.IBolaoService;
import bolao.util.DataUtil;

public class MB {
	
	@ManagedProperty("#{sessaoMB}")
	SessaoMB sessaoMB;
	
	@ManagedProperty("#{bolaoService}")
	IBolaoService bolaoService;
	
	public Usuario getUsuarioLogado() throws UsuarioException{
		return sessaoMB.getUsuarioLogado();
	}
	
	public Date dataLimiteAposta() {
		return this.bolaoService.dataLimiteAposta();
	}
	
	public boolean permiteAposta(){
		return !DataUtil.isDataAnterior(dataLimiteAposta());
	}

	public SessaoMB getSessaoMB() {
		return sessaoMB;
	}

	public void setSessaoMB(SessaoMB sessaoMB) {
		this.sessaoMB = sessaoMB;
	}

	public IBolaoService getBolaoService() {
		return bolaoService;
	}

	public void setBolaoService(IBolaoService bolaoService) {
		this.bolaoService = bolaoService;
	}
}
