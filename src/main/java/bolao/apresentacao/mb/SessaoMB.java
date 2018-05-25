package bolao.apresentacao.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;
import javax.faces.context.ExternalContext;

import bolao.excecoes.UsuarioException;
import bolao.model.Usuario;
import bolao.services.IUsuarioService;
import bolao.util.FacesUtil;

@ManagedBean(name = "sessaoMB")
@SessionScoped
public class SessaoMB {

	private Usuario usuarioLogado;
	
	@ManagedProperty(value="#{usuarioService}")
	private IUsuarioService usuarioService;

	public Usuario getUsuarioLogado() throws UsuarioException {
		
		if(this.usuarioLogado == null){
			this.usuarioLogado = this.usuarioService
					.buscaUsuarioParaSessao(getLoginUsuarioLogado());
		}
		
		return usuarioLogado;
	}
	
	public boolean estaLogado() {
		return getLoginUsuarioLogado() != null;
	}

	public void setUsuarioLogado(Usuario usuario) {
		this.usuarioLogado = usuario;
	}

	private String getLoginUsuarioLogado() {

		ExternalContext external = FacesUtil.getExternalContext();
		String login = external.getRemoteUser();
		
		return login;
	}

	public IUsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(IUsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
}