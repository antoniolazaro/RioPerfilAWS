package br.com.rio.app.riolegal.vo;

import java.sql.Timestamp;

public class TokenVO {

	private String tokenAcesso;
	private Timestamp tokenExpires;
	
	public TokenVO() {
		// TODO Auto-generated constructor stub
	}
	
	public TokenVO(String tokenAcesso, Timestamp tokenExpires) {
		super();
		this.tokenAcesso = tokenAcesso;
		this.tokenExpires = tokenExpires;
	}

	public String getTokenAcesso() {
		return tokenAcesso;
	}
	public void setTokenAcesso(String tokenAcesso) {
		this.tokenAcesso = tokenAcesso;
	}
	public Timestamp getTokenExpires() {
		return tokenExpires;
	}
	public void setTokenExpires(Timestamp tokenExpires) {
		this.tokenExpires = tokenExpires;
	}
}
