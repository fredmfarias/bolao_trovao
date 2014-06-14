package bolao.excecoes;

public class RankingException extends Exception{

	private static final long serialVersionUID = 6200996812262055399L;

	public RankingException(String message){
		super(message);
	}
	
	public RankingException(String message, Throwable e){
		super(message, e);
	}
}
