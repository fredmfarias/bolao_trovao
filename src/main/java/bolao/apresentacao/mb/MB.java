package bolao.apresentacao.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;

import bolao.excecoes.UsuarioException;
import bolao.model.Usuario;

//@ManagedBean(name="MB")
public class MB {
	
	@ManagedProperty("#{utilMB}")
	UtilMB utilMB;
	
	public Usuario getUsuarioLogado() throws UsuarioException{
		return utilMB.getUsuarioLogado();
	}

	public UtilMB getUtilMB() {
		return utilMB;
	}

	public void setUtilMB(UtilMB utilMB) {
		this.utilMB = utilMB;
	}
}
