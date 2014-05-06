package bolao.controller;

import bolao.dao.UsuarioDAO;
import bolao.model.Usuario;
import bolao.util.DAOFactory;

public class UsuarioController {
	private UsuarioDAO usuarioDAO;
	
	public UsuarioController(){
		this.usuarioDAO = DAOFactory.criarUsuarioDAO();
	}
	
	public void salvar(Usuario usuario){
		Integer codigo = usuario.getId();
		
		if(codigo == null || codigo.equals(0)){
			this.usuarioDAO.salvar(usuario);
		}
	}
}
