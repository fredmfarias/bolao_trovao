package bolao.util;


public class DAOFactory {
	
	public static UsuarioDao criarUsuarioDAO(){
		return new UsuarioDaoHibernate();
	}
}