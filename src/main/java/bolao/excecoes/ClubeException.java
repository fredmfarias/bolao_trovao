package bolao.excecoes;

public class ClubeException extends Exception{

	private static final long serialVersionUID = 8534300798733283224L;

	public ClubeException(String message){
		super(message);
	}
	
	public ClubeException(String message, Throwable e){
		super(message, e);
	}
}
