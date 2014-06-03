package bolao.apresentacao.mb;

import java.util.Date;

import javax.faces.bean.ManagedProperty;

import bolao.excecoes.UsuarioException;
import bolao.model.Usuario;

public class MB {
	
	@ManagedProperty("#{sessaoMB}")
	SessaoMB sessaoMB;
	
	@ManagedProperty("#{aplicacaoMB}")
	AplicacaoMB aplicacaoMB;
	
	public Usuario getUsuarioLogado() throws UsuarioException{
		return sessaoMB.getUsuarioLogado();
	}
	
	public Date dataLimiteAposta() {
		return aplicacaoMB.dataLimiteAposta();
	}

	public SessaoMB getSessaoMB() {
		return sessaoMB;
	}

	public void setSessaoMB(SessaoMB sessaoMB) {
		this.sessaoMB = sessaoMB;
	}

	public AplicacaoMB getAplicacaoMB() {
		return aplicacaoMB;
	}

	public void setAplicacaoMB(AplicacaoMB aplicacaoMB) {
		this.aplicacaoMB = aplicacaoMB;
	}
}
