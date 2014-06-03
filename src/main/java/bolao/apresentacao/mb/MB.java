package bolao.apresentacao.mb;

import javax.faces.bean.ManagedProperty;

import bolao.excecoes.UsuarioException;
import bolao.model.Usuario;

public class MB {
	
	@ManagedProperty("#{sessaoMB}")
	SessaoMB sessaoMB;
	
	public Usuario getUsuarioLogado() throws UsuarioException{
		return sessaoMB.getUsuarioLogado();
	}

	public SessaoMB getSessaoMB() {
		return sessaoMB;
	}

	public void setSessaoMB(SessaoMB sessaoMB) {
		this.sessaoMB = sessaoMB;
	}
}
