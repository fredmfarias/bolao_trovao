package bolao.excecoes;

public class JogoException extends Exception{

	private static final long serialVersionUID = 6200996812262055399L;

	public JogoException(String message){
		super(message);
	}
	
	public JogoException(String message, Throwable e){
		super(message, e);
	}
}
