package bolao.apresentacao.mb;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;

import bolao.excecoes.UsuarioException;
import bolao.model.Usuario;
import bolao.services.IUsuarioService;
import bolao.util.MessagesProperty;

@ManagedBean(name="controleUsuarioMB")
@ViewScoped
public class ControleUsuarioMB implements Serializable{
	
	private static final long serialVersionUID = 7655039086086016262L;

	List<Usuario> usuarios;
	
	@ManagedProperty(value="#{usuarioService}")
	private IUsuarioService usuarioService;
	
	@PostConstruct
	public void init(){
		this.usuarios = this.usuarioService.getAllUsuarios();
	}
	
	public void atualizarUsuario(Usuario usuario){
		try {
			this.usuarioService.atualizaUsuario(usuario);
			MessagesProperty.sucessoMsg("MN0001");
		} catch (UsuarioException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0013");
		}
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public IUsuarioService getUsuarioService() {
		return usuarioService;
	}

	public void setUsuarioService(IUsuarioService usuarioService) {
		this.usuarioService = usuarioService;
	}
	
}
