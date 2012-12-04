package br.com.rio.app.riolegal.vo;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "contador_acesso")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "COD_CONTADOR")) })
public class ContadorAcessoVO extends AbstractVO {
	
	@Column(name = "DAT_ACESSO")
	private Date dataAcesso;
	@Column(name = "DES_IP_ACESSO")
	private String ipAcesso;
	
	public Date getDataAcesso() {
		return dataAcesso;
	}
	public void setDataAcesso(Date dataAcesso) {
		this.dataAcesso = dataAcesso;
	}
	public String getIpAcesso() {
		return ipAcesso;
	}
	public void setIpAcesso(String ipAcesso) {
		this.ipAcesso = ipAcesso;
	}

}
