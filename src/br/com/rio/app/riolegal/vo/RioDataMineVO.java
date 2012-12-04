package br.com.rio.app.riolegal.vo;

import java.io.Serializable;

public class RioDataMineVO implements Serializable{

	private String nomeObjeto;
	private String descricao;
	private String descricaoResumida;
	private String informationUrl;
	private String email;
	private String webSite;
	private String telefone;
	private String informacoesGerais;
	private String organizacao;
	private String local;
	private String tipoTaxomomia;
	private String valorTaxonomia;
	private String bairro;
	private String endereco;
	private String latitude;
	private String longitude;
	private String distanciaCalculada;
	
	private String ilustrationIcon;
	private String ilustrationColour;
	private String urlDivulgacao;
	
	private MarcadorVO marcadorVO;
	
	public String getNomeObjeto() {
		return nomeObjeto;
	}
	public void setNomeObjeto(String nomeObjeto) {
		this.nomeObjeto = nomeObjeto;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getWebSite() {
		return webSite;
	}
	public void setWebSite(String webSite) {
		this.webSite = webSite;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getInformacoesGerais() {
		return informacoesGerais;
	}
	public void setInformacoesGerais(String informacoesGerais) {
		this.informacoesGerais = informacoesGerais;
	}
	public String getOrganizacao() {
		return organizacao;
	}
	public void setOrganizacao(String organizacao) {
		this.organizacao = organizacao;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}
	public String getTipoTaxomomia() {
		return tipoTaxomomia;
	}
	public void setTipoTaxomomia(String tipoTaxomomia) {
		this.tipoTaxomomia = tipoTaxomomia;
	}
	public String getValorTaxonomia() {
		return valorTaxonomia;
	}
	public void setValorTaxonomia(String valorTaxonomia) {
		this.valorTaxonomia = valorTaxonomia;
	}
	public String getBairro() {
		return bairro;
	}
	public void setBairro(String bairro) {
		this.bairro = bairro;
	}
	public String getDistanciaCalculada() {
		return distanciaCalculada;
	}
	public void setDistanciaCalculada(String distanciaCalculada) {
		this.distanciaCalculada = distanciaCalculada;
	}
	public String getInformationUrl() {
		return informationUrl;
	}
	public void setInformationUrl(String informationUrl) {
		this.informationUrl = informationUrl;
	}
	public String getIlustrationIcon() {
		return ilustrationIcon;
	}
	public void setIlustrationIcon(String ilustrationIcon) {
		this.ilustrationIcon = ilustrationIcon;
	}
	public String getIlustrationColour() {
		return ilustrationColour;
	}
	public void setIlustrationColour(String ilustrationColour) {
		this.ilustrationColour = ilustrationColour;
	}
	public MarcadorVO getMarcadorVO() {
		return marcadorVO;
	}
	public void setMarcadorVO(MarcadorVO marcadorVO) {
		this.marcadorVO = marcadorVO;
	}
	public String getDescricaoResumida() {
		return descricaoResumida;
	}
	public void setDescricaoResumida(String descricaoResumida) {
		this.descricaoResumida = descricaoResumida;
	}
	public String getUrlDivulgacao() {
		return urlDivulgacao;
	}
	public void setUrlDivulgacao(String urlDivulgacao) {
		this.urlDivulgacao = urlDivulgacao;
	}
}
