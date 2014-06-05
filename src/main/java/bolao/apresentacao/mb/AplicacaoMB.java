package bolao.apresentacao.mb;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import bolao.services.IBolaoService;
import bolao.services.impl.BolaoService;
import bolao.util.DataUtil;
import bolao.util.PrimeFacesUtil;

@ManagedBean(name = "aplicacaoMB")
@ApplicationScoped
public class AplicacaoMB {
	
	@ManagedProperty(value="#{bolaoService}")
	private IBolaoService bolaoService;
	
	public void cronometroRegressivo(){
		String script = "atualizaContador(" + BolaoService.ANO + ", " + BolaoService.MES 
				+ ", " + BolaoService.DIA + ", " + BolaoService.HORA + ", " + BolaoService.MIN + ", 'elemento')";
		if(!DataUtil.isDataAnterior(this.bolaoService.dataLimiteAposta())){
			PrimeFacesUtil.executeJavaScript(script);
		}
	}

	public IBolaoService getBolaoService() {
		return bolaoService;
	}

	public void setBolaoService(IBolaoService bolaoService) {
		this.bolaoService = bolaoService;
	}
}