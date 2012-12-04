package br.com.rio.app.riolegal.exception;

public class AplicacaoException extends Exception{
	
	private String message;
	
	public AplicacaoException() {
		super();
	}
	
	public AplicacaoException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
