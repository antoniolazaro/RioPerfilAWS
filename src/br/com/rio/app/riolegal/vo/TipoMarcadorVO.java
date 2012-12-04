package br.com.rio.app.riolegal.vo;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.validator.NotEmpty;

@Entity
@Table(name = "tipo_marcador")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "COD_TIPO_MARCADOR")) })
public class TipoMarcadorVO extends AbstractVO {
	
	@Column(name = "DESCRICAO")
	@NotEmpty(message="Campo obrigat—rio.")
	private String descricao;
	@Column(name = "URL_ICONE")
	private String urlIcone;
	@Column(name = "URL_SERVICO")
	private String urlServico;
	@Column(name = "FLG_ATIVO")
	private String flagAtivo;
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getUrlIcone() {
		return urlIcone;
	}
	public void setUrlIcone(String urlIcone) {
		this.urlIcone = urlIcone;
	}
	public String getUrlServico() {
		return urlServico;
	}
	public void setUrlServico(String urlServico) {
		this.urlServico = urlServico;
	}
	public String getFlagAtivo() {
		return flagAtivo;
	}
	public void setFlagAtivo(String flagAtivo) {
		this.flagAtivo = flagAtivo;
	}
}
