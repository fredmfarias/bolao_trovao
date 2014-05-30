package bolao.excecoes;

public class ApostaException extends Exception{

	private static final long serialVersionUID = 4825728276596209777L;

	public ApostaException(String message){
		super(message);
	}
	
	public ApostaException(String message, Throwable e){
		super(message, e);
	}
}
