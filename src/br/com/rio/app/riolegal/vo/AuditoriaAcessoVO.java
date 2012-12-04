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

@Entity
@Table(name = "auditoria_acesso")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "COD_ACESSO")) })
public class AuditoriaAcessoVO extends AbstractVO {

	@Column(name = "DAT_ACESSO")
	private Date dataAcesso;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "COD_USUARIO")
	private UsuarioVO usuarioVO;
	
	public Date getDataAcesso() {
		return dataAcesso;
	}
	public void setDataAcesso(Date dataAcesso) {
		this.dataAcesso = dataAcesso;
	}
	public UsuarioVO getUsuarioVO() {
		return usuarioVO;
	}
	public void setUsuarioVO(UsuarioVO usuarioVO) {
		this.usuarioVO = usuarioVO;
	}
		
}
