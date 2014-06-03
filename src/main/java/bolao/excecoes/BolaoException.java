package bolao.excecoes;

public class BolaoException extends Exception {
	
	private static final long serialVersionUID = 7711254230465815132L;

	public BolaoException(String message) {
		super(message);
	}
	
	public BolaoException(String message, Throwable throwable) {
		super(message, throwable);
	}
}
