package br.com.rio.app.riolegal.integracao.riodatamineservices;

public interface RetornosHTTPAPI {

	int STATUS_OK = 200;
	int STATUS_AUSENCIA_ARGUMENTOS = 400;
	int STATUS_NAO_AUTORIZADO = 401;
	int STATUS_URL_NAO_ENCONTRADA = 404;
	int STATUS_ERRO_EXECUCAO = 500;
	
	String MENSAGEM_STATUS_OK = "Retorno ok";
	String MENSAGEM_STATUS_AUSENCIA_ARGUMENTOS = "Aus�ncia de argumentos obrigat�rios";
	String MENSAGEM_STATUS_NAO_AUTORIZADO = "Requisi��o n�o autorizada";
	String MENSAGEM_STATUS_URL_NAO_ENCONTRADA = "P�gina n�o encontrada";
	String MENSAGEM_STATUS_ERRO_EXECUCAO = "Erro 500 na comunica��o com a API Rio Data Mine";
	String MENSAGEM_STATUS_ERRO_DESCONHECIDO = "N�o foi poss�vel comunicar com a API Rio Data Mine.";
}
