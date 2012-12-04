package br.com.rio.app.riolegal.exception;

public class AmbienteException extends RuntimeException {
	
	private String message;
	
	public AmbienteException() {
		super();
	}
	
	public AmbienteException(String message) {
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
