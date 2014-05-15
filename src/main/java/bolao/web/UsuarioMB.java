package bolao.web;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import bolao.controller.UsuarioController;
import bolao.model.Usuario;
import bolao.util.MessagesProperty;

@ManagedBean(name="usuarioMB")
@RequestScoped
public class UsuarioMB {
	private Usuario usuario;
	private String confirmarSenha;
	
	public UsuarioMB(){
		this.usuario = new Usuario();
	}
	
	public String salvar() {
		
		String senha = this.usuario.getSenha();
		if (!senha.equals(this.confirmarSenha)) {
			MessagesProperty.errorMsg("MN0004");
			return null;
		}

		try{
			UsuarioController usuarioRN = new UsuarioController();
			usuarioRN.salvar(this.usuario);
			
			MessagesProperty.sucessoMsg("MN0001");
		}catch(Throwable e){
			e.printStackTrace();
			MessagesProperty.errorMsg("MN0005");
		}
		
		return null;
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
}
