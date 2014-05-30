package bolao.excecoes;

public class UsuarioException extends Exception{

	private static final long serialVersionUID = 4825728276596209777L;

	public UsuarioException(String message){
		super(message);
	}
	
	public UsuarioException(String message, Throwable e){
		super(message, e);
	}
}
