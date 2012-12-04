package br.com.rio.app.riolegal.integracao.riodatamineservices;

import org.apache.commons.lang3.StringUtils;

import br.com.rio.app.riolegal.vo.ParametrosVO;

public class CriadorUrlsRioDataMine {

	public String criaURLAutenticacaoRioDataMine(String appId,String appSecret,String redirectUri){
		StringBuilder builder = new StringBuilder("http://api.riodatamine.com.br/rest/request-token?");
		builder.append("app-id=").append(appId).append("&app-secret=").append(appSecret);
		if(StringUtils.isNotEmpty(redirectUri)){
			builder.append("&redirect_uri=").append(redirectUri);
		}
		return builder.toString();
	}
	
	public String criaURLConsultaServicoRioDataMine(String servico,ParametrosVO parametros){
		StringBuilder builder = new StringBuilder("http://api.riodatamine.com.br");
		builder.append(servico);
		String format = parametros.getFormat();
		if(parametros == null || StringUtils.isEmpty(parametros.getFormat()))
			format = "json";
		builder.append("?format=").append(format);
		
		if(parametros != null){
			if(StringUtils.isNotEmpty(parametros.getSearch()))
				builder.append("&").append("search").append("=").append(parametros.getSearch());
			if(StringUtils.isNotEmpty(parametros.getLocation()))
				builder.append("&").append("location").append("=").append(parametros.getLocation());
			if(StringUtils.isNotEmpty(parametros.getNeighbourhood()))
				builder.append("&").append("neighbourhood").append("=").append(parametros.getNeighbourhood());
			if(parametros.getRadius() != null)
				builder.append("&").append("radius").append("=").append(parametros.getRadius());
			if(StringUtils.isNotEmpty(parametros.getDataInicio()))
				builder.append("&").append("start-date").append("=").append(parametros.getDataInicio());
			if(StringUtils.isNotEmpty(parametros.getDataFim()))
				builder.append("&").append("end-date").append("=").append(parametros.getDataFim());
		}
		return builder.toString();
	}
}
