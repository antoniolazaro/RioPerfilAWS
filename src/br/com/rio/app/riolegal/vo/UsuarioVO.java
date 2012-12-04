package br.com.rio.app.riolegal.vo;

import java.util.Date;
import java.util.List;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.validator.Email;
import org.hibernate.validator.Length;
import org.hibernate.validator.NotEmpty;

@Entity
@Table(name = "usuario")
@AttributeOverrides({ @AttributeOverride(name = "id", column = @Column(name = "COD_USUARIO")) })
public class UsuarioVO extends AbstractVO{
	
	@Column(name = "NOME")
	@Length(max=100,message="Nome do usu�rio deve possuir no m�ximo 100 caracteres")
	@NotEmpty(message="Campo nome � obrigat�rio.")
	private String nome;
	@Column(name = "SENHA")
	@Length(max=45,message="Senha do usu�rio deve possuir no m�ximo 45 caracteres")
	@NotEmpty(message="Campo senha � obrigat�rio.")
	private String senha;
	@Column(name = "EMAIL",unique=true)
	@Length(max=50,message="Email do usu�rio deve possuir no m�ximo 50 caracteres")
	@NotEmpty(message="Campo email � obrigat�rio.")
	//@Email(message="Email inv�lido.")
	private String email;
	@Column(name = "ENDERECO")
	@Length(max=150,message="Endere�o do usu�rio deve possuir no m�ximo 150 caracteres")
	@NotEmpty(message="Campo endere�o � obrigat�rio.")
	private String endereco;
	@Column(name = "RG")
	private String rg;
	@Column(name = "FLG_ATIVO")
	private String flagAtivo;
	@Column(name = "DATA_CRIACAO")
	private Date dataCriacao;
	@Column(name = "DATA_NASCIMENTO")
	private Date dataNascimento;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getFlagAtivo() {
		return flagAtivo;
	}
	public void setFlagAtivo(String flagAtivo) {
		this.flagAtivo = flagAtivo;
	}
	public Date getDataCriacao() {
		return dataCriacao;
	}
	public void setDataCriacao(Date dataCriacao) {
		this.dataCriacao = dataCriacao;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
