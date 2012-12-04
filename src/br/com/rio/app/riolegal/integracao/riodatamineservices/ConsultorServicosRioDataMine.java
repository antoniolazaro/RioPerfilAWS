package br.com.rio.app.riolegal.integracao.riodatamineservices;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.sql.Timestamp;

import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.vo.ParametrosVO;
import br.com.rio.app.riolegal.vo.TokenVO;

public class ConsultorServicosRioDataMine {
	
	private static TokenVO tokenModel;
	private CriadorUrlsRioDataMine criadorUrlsRioDataMine;
//	private static final String  APP_ID = "347822ab2fb1bb2fb851c54b518888f2";
//	private static final String  APP_SECRET = "8azoc-13se5-od6vn";

	//para vers‹o criada em 03/04/2012
	private static final String  APP_ID = "28f2c37f124ad41b354311aecab9c6de";
	private static final String  APP_SECRET = "44jne-mgl4v-umm3t";
	
	public ConsultorServicosRioDataMine() throws Exception{
		criadorUrlsRioDataMine = new CriadorUrlsRioDataMine();
	}
	
	private boolean validarRetornoRequest(HttpURLConnection conn) throws AplicacaoException,IOException{
		switch (conn.getResponseCode()) {
		case RetornosHTTPAPI.STATUS_OK:
			return true;
		case RetornosHTTPAPI.STATUS_AUSENCIA_ARGUMENTOS:
			throw new AplicacaoException(RetornosHTTPAPI.MENSAGEM_STATUS_AUSENCIA_ARGUMENTOS);
		case RetornosHTTPAPI.STATUS_NAO_AUTORIZADO:
			throw new AplicacaoException(RetornosHTTPAPI.MENSAGEM_STATUS_NAO_AUTORIZADO);
		case RetornosHTTPAPI.STATUS_URL_NAO_ENCONTRADA:
			throw new AplicacaoException(RetornosHTTPAPI.MENSAGEM_STATUS_URL_NAO_ENCONTRADA);
		case RetornosHTTPAPI.STATUS_ERRO_EXECUCAO:
			throw new AplicacaoException(RetornosHTTPAPI.MENSAGEM_STATUS_ERRO_EXECUCAO + " "+conn.getResponseMessage());
		default:
			throw new AmbienteException(RetornosHTTPAPI.MENSAGEM_STATUS_ERRO_DESCONHECIDO);
		}
	}
	
	private String getRespostaAsString(HttpURLConnection conn) throws IOException{
        BufferedReader rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
        StringBuilder sb = new StringBuilder();
        String line;
        while((line = rd.readLine()) != null)
               sb.append(line);
        rd.close();                      
        return sb.toString();
	}
	
	private boolean isTokenValido6Horas(){
		if(tokenModel != null){
			long tempoAtual = System.currentTimeMillis();
			long diferencaTempo = tempoAtual - tokenModel.getTokenExpires().getTime();
			double diferencaEmHoras = diferencaTempo / (1000 * 60 * 60);
			if(diferencaEmHoras < 6){
				return true;
			}
		}
		return false;
	}
	
	private void autenticaRioDataMine(String appId,String appSecret,String redirectUri) throws Exception{
//		System.out.println("vai autenticar n oservio...");
		URL url = new URL(criadorUrlsRioDataMine.criaURLAutenticacaoRioDataMine(appId,appSecret,redirectUri));
		HttpURLConnection conn = (HttpURLConnection)  url.openConnection();
		conn.setRequestMethod("GET");
		conn.setConnectTimeout(30*1000);
		try{
			conn.connect();
			if(validarRetornoRequest(conn)){
				 String tokenAcesso = conn.getHeaderField("X-Access-Token");
				 String tokenExpires = conn.getHeaderField("X-Access-Token-Expires");
				 Timestamp stamp = new Timestamp(Long.valueOf(tokenExpires));
				 tokenModel = new TokenVO(tokenAcesso,stamp);
			}
		}catch (SocketTimeoutException e) {
			throw new AmbienteException("Falha na comunica‹o com o Servio RioDataMine. Tente acessar o servio novamente dentro de 5 minutos.");
		}
	}
	
	public String consultaServicoRioDataMine(String servico,ParametrosVO parametros) throws Exception{
		if(!isTokenValido6Horas()){
			this.autenticaRioDataMine(APP_ID, APP_SECRET, null);
		}
		return getRespostaRioDataMine(servico, parametros);
	}

	private String getRespostaRioDataMine(String servico,ParametrosVO parametros) throws MalformedURLException, IOException, AplicacaoException {
		URL url = new URL(criadorUrlsRioDataMine.criaURLConsultaServicoRioDataMine(servico,parametros));
		HttpURLConnection conn = (HttpURLConnection)  url.openConnection();
		conn.setDoInput(true);
		conn.setDoOutput(true);
		conn.setRequestProperty("Request-Method", "GET"); 
		conn.setRequestProperty("Authorization:OAuth2.0", tokenModel.getTokenAcesso());
		conn.setRequestProperty("Content-Type","application/json; charset=iso-8859-1");
		conn.connect();
		String respostaServico = "";
		if(validarRetornoRequest(conn)){   
			respostaServico = getRespostaAsString(conn);
		}
		return respostaServico;
	}

}
