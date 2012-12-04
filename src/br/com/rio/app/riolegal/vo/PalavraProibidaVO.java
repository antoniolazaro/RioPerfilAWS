package br.com.rio.app.riolegal.vo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "palavra_proibida")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "CODIGO")) })
public class PalavraProibidaVO extends AbstractVO {
	
	@Column(name = "DESCRICAO")
	private String descricao;
	@Column(name = "FLG_ATIVO")
	private String flagAtivo;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getFlagAtivo() {
		return flagAtivo;
	}
	public void setFlagAtivo(String flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

}
