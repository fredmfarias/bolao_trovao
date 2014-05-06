package bolao.web;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

import bolao.controller.UsuarioController;
import bolao.model.Usuario;

@ManagedBean(name="usuarioMB")
@RequestScoped
public class UsuarioMB {
	private Usuario usuario;
	private String confirmarSenha;
	
	public UsuarioMB(){
		this.usuario = new Usuario();
	}
	
	public String salvar() {
		FacesContext context = FacesContext.getCurrentInstance();

		String senha = this.usuario.getSenha();
		if (!senha.equals(this.confirmarSenha)) {
			FacesMessage facesMessage = new FacesMessage("A senha não foi confirmada corretamente");
			context.addMessage(null, facesMessage);
			return null;
		}

		try{
			UsuarioController usuarioRN = new UsuarioController();
			usuarioRN.salvar(this.usuario);
			
			FacesMessage facesMessage = new FacesMessage("Usuario add com sucesso!");
			context.addMessage(null, facesMessage);
		}catch(Exception e){
			e.printStackTrace();
			FacesMessage facesMessage = new FacesMessage("Falha ao adicionar usuario");
			context.addMessage(null, facesMessage);
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
