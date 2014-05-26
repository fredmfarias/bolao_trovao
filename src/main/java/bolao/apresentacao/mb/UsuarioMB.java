package bolao.apresentacao.mb;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

import bolao.model.Usuario;
import bolao.services.IUsuarioService;
import bolao.util.MessagesProperty;

@ManagedBean(name="usuarioMB")
@RequestScoped
public class UsuarioMB {
	private Usuario usuario;
	private String confirmarSenha;
	
	@ManagedProperty(value="#{UsuarioService}")
	IUsuarioService usuarioService;
	
	public UsuarioMB(){
		this.usuario = new Usuario();
	}
	
	public String salvar() {
		
		String senha = this.usuario.getSenha();
		if (!senha.equals(this.confirmarSenha)) {
			MessagesProperty.errorMsg("MN0004");
			return null;
		}

		if(getUsuarioService().existeLogin(getUsuario().getLogin())){
			MessagesProperty.errorMsg("MN0006");
			return null;
		}
		
		try{
			getUsuarioService().addUsuario(usuario);
			
			MessagesProperty.sucessoMsg("MN0001");
		}catch(Throwable e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0005");
		}
		
		return null;
	}
	
	public void handleBlurEvent() {
        if(getUsuarioService().existeLogin(getUsuario().getLogin()))
        	MessagesProperty.errorMsg("MN0006");
    }
	
	public Usuario getUsuario() {
		return usuario;
	}
	
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public String getConfirmarSenha() {
		return confirmarSenha;
	}
	public void setConfirmarSenha(String confirmarSenha) {
		this.confirmarSenha = confirmarSenha;
	}

	public IUsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(IUsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
}
