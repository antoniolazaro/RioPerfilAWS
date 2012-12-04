package br.com.rio.app.riolegal.vo;

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.Length;
import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.NotNull;
import org.hibernate.validator.Range;

@Entity
@Table(name = "comentario")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "COD_COMENTARIO")) })
public class ComentarioVO extends AbstractVO {
	
	@Column(name = "DESCRICAO")
	@Length(max=140,message="Comentário deve possuir no máximo 140 caracteres")
	@NotEmpty(message="Campo descrição é obrigatório.")
	private String descricao;
	@Column(name = "DATA_CRIACAO")
	@NotNull(message="Campo data de criação é obrigatório.")
	private Date dataCriacao;
	@Column(name = "VALOR")
	@NotNull(message="Campo valor da nota é obrigatório.")
	@Range(min=0,max=5,message="Nota deve estar no intervalo entre 0 e 5.")
	private Integer nota;
	@Column(name = "FLG_ATIVO")
	private String flagAtivo;
	@Column(name = "FLG_COMENT_FACEBOOK")
	private String flagComentarioFacebook;
	@Column(name = "FLG_COMENT_TWITTER")
	private String flagComentarioTwitter;
	
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_USUARIO")
	@NotNull(message="Campo usuário é obrigatório.")
	private UsuarioVO usuarioVO;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_MARCADOR")
	@NotNull(message="Campo marcador é obrigatório.")
	private MarcadorVO marcadorVO;

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Date getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public Integer getNota() {
		return nota;
	}

	public void setNota(Integer nota) {
		this.nota = nota;
	}

	public String getFlagAtivo() {
		return flagAtivo;
	}

	public void setFlagAtivo(String flagAtivo) {
		this.flagAtivo = flagAtivo;
	}

	public UsuarioVO getUsuarioVO() {
		return usuarioVO;
	}

	public void setUsuarioVO(UsuarioVO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}

	public MarcadorVO getMarcadorVO() {
		return marcadorVO;
	}

	public void setMarcadorVO(MarcadorVO marcadorVO) {
		this.marcadorVO = marcadorVO;
	}

	public String getFlagComentarioFacebook() {
		return flagComentarioFacebook;
	}

	public void setFlagComentarioFacebook(String flagComentarioFacebook) {
		this.flagComentarioFacebook = flagComentarioFacebook;
	}

	public String getFlagComentarioTwitter() {
		return flagComentarioTwitter;
	}

	public void setFlagComentarioTwitter(String flagComentarioTwitter) {
		this.flagComentarioTwitter = flagComentarioTwitter;
	}


}
