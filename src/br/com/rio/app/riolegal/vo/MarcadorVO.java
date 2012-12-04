package br.com.rio.app.riolegal.vo;

import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.NotNull;

@Entity
@Table(name = "marcador")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "COD_MARCADOR")) })
public class MarcadorVO extends AbstractVO {
	
	@Column(name = "LATITUDE")
	@NotEmpty(message="Campo latitude é obrigatório.")
	private String latitude;
	@Column(name = "LONGITUDE")
	@NotEmpty(message="Campo longitude é obrigatório.")
	private String longitude;
	@Column(name = "DESCRICAO")
	@Length(max=100,message="Descrição do marcador deve possuir no máximo 100 caracteres")
	private String descricao;
	@Column(name = "FLG_ATIVO")
	private String flagAtivo;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_TIPO_MARCADOR")
	@NotNull(message="Campo tipo marcador é obrigatório.")
	private TipoMarcadorVO tipoMarcadorVO;
	
	@OneToMany(mappedBy="marcadorVO", fetch = FetchType.LAZY)
	private List<ComentarioVO> listaComentarios;
	
	@Transient
	private double mediaComentarios;

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

	public TipoMarcadorVO getTipoMarcadorVO() {
		return tipoMarcadorVO;
	}

	public void setTipoMarcadorVO(TipoMarcadorVO tipoMarcadorVO) {
		this.tipoMarcadorVO = tipoMarcadorVO;
	}

	public List<ComentarioVO> getListaComentarios() {
		return listaComentarios;
	}

	public void setListaComentarios(List<ComentarioVO> listaComentarios) {
		this.listaComentarios = listaComentarios;
	}

	public double getMediaComentarios() {
		return mediaComentarios;
	}

	public void setMediaComentarios(double mediaComentarios) {
		this.mediaComentarios = mediaComentarios;
	}

}
