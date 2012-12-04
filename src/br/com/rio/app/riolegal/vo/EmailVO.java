package br.com.rio.app.riolegal.vo;

import java.io.Serializable;
import java.util.List;

public class EmailVO implements Serializable {
	
	private String titulo;
	private String corpo;
	private List<String> destinatarios;
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getCorpo() {
		return corpo;
	}
	public void setCorpo(String corpo) {
		this.corpo = corpo;
	}
	public List<String> getDestinatarios() {
		return destinatarios;
	}
	public void setDestinatarios(List<String> destinatarios) {
		this.destinatarios = destinatarios;
	}

}
