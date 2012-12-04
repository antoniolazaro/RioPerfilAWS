package br.com.rio.app.riolegal.vo;

import java.io.Serializable;

public class LocalizacaoVO implements Serializable {
	
	private String type;
	private String latitude;
	private String longitude;
	private String enderecoFormatado;
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLatitude() {
		return latitude;
	}
	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}
	public String getLongitude() {
		return longitude;
	}
	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}
	public String getEnderecoFormatado() {
		return enderecoFormatado;
	}
	public void setEnderecoFormatado(String enderecoFormatado) {
		this.enderecoFormatado = enderecoFormatado;
	}

}
