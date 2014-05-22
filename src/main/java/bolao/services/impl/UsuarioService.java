package bolao.services.impl;

import org.springframework.transaction.annotation.Transactional;

import bolao.dao.UsuarioDAO;
import bolao.model.Usuario;
import bolao.services.IUsuarioService;

@Transactional(readOnly = true)
public class UsuarioService implements IUsuarioService {
	
	UsuarioDAO usuarioDAO;
	
	@Override
	@Transactional(readOnly = false)
	public void addUsuario(Usuario usuario) {
		Long codigo = usuario.getId();

		if (codigo == null || codigo.equals(0)) {
			getUsuarioDAO().salvar(usuario);
		}
	}

	public UsuarioDAO getUsuarioDAO() {
		return usuarioDAO;
	}

	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}

}
