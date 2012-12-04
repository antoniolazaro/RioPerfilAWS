package br.com.rio.app.riolegal.integracao.localizacao;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;

import org.apache.commons.lang3.StringUtils;

import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.integracao.riodatamineservices.RetornosHTTPAPI;

public class ConsultorServicoGeocodeGoogle {
	
	public String consultarServicoGeocodeGoogle(String latitude,String longitude) throws AplicacaoException{
		try{
			URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?sensor=false&latlng="+latitude+","+longitude);
			return converterRespostaGoogleString(url);
		}catch (Exception e) {
			throw new AmbienteException(e.getMessage());
		}
	}
	
	public String consultarServicoGeocodeGoogle(String endereco) throws AplicacaoException{
		try{
			URL url = new URL("http://maps.googleapis.com/maps/api/geocode/json?sensor=false&address="+formatarEnderecoGoogle(endereco));
			return converterRespostaGoogleString(url);
		}catch (Exception e) {
			throw new AmbienteException(e.getMessage());
		}
	}
	
	private String converterRespostaGoogleString(URL url) throws IOException, AplicacaoException{
		String respostaServico = "";
		HttpURLConnection conn = (HttpURLConnection)  url.openConnection();
		conn.setRequestProperty("Request-Method", "GET"); 
		conn.connect();
        int responseCode = conn.getResponseCode();
        if(validarRetornoRequest(responseCode)){   
        	respostaServico = getRespostaAsString(conn);
        }
		return respostaServico;
	}
	
	private String formatarEnderecoGoogle(String endereco){
		if(StringUtils.isNotEmpty(endereco)){
			return endereco.replaceAll(" ", "%20");
		}
		return endereco;
	}
	
	private String getRespostaAsString(HttpURLConnection conn) throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream(),Charset.forName("UTF-8")));
        StringBuilder sb = new StringBuilder();
        String line;
        while((line = rd.readLine()) != null)
               sb.append(line);
        rd.close();                      
        return sb.toString();
	}
	
	private boolean validarRetornoRequest(int responseCode) throws AplicacaoException{
		switch (responseCode) {
		case RetornosHTTPAPI.STATUS_OK:
			return true;
		case RetornosHTTPAPI.STATUS_AUSENCIA_ARGUMENTOS:
			throw new AplicacaoException(RetornosHTTPAPI.MENSAGEM_STATUS_AUSENCIA_ARGUMENTOS);
		case RetornosHTTPAPI.STATUS_NAO_AUTORIZADO:
			throw new AplicacaoException(RetornosHTTPAPI.MENSAGEM_STATUS_NAO_AUTORIZADO);
		case RetornosHTTPAPI.STATUS_URL_NAO_ENCONTRADA:
			throw new AplicacaoException(RetornosHTTPAPI.MENSAGEM_STATUS_URL_NAO_ENCONTRADA);
		case RetornosHTTPAPI.STATUS_ERRO_EXECUCAO:
			throw new AplicacaoException(RetornosHTTPAPI.MENSAGEM_STATUS_ERRO_EXECUCAO);
		default:
			throw new AplicacaoException(RetornosHTTPAPI.MENSAGEM_STATUS_ERRO_DESCONHECIDO);
		}
	}
}
