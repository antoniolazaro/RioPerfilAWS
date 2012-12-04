package br.com.rio.app.riolegal.integracao;

import org.json.JSONException;
import org.json.JSONObject;

public abstract class ExtratorConteudoRespostaJsonAb {
	
	protected String getValorFromJson(JSONObject json,String nomeAtributo){
		String retorno = "";
		try{
			retorno = json.getString(nomeAtributo);
		}catch (JSONException e) {
			
		}
		return retorno;
	}
	
	protected String getValorFromJson(JSONObject json,String nomeJsonObject,String nomeAtributo){
		String retorno = "";
		try{
			retorno = json.getJSONObject(nomeJsonObject).getString(nomeAtributo);
		}catch (JSONException e) {
			
		}
		return retorno;
	}
	
	protected String getValorFromJson(JSONObject json,String nomeJsonObject,String nomeJsonInterno,String nomeAtributo){
		String retorno = "";
		try{
			retorno = json.getJSONObject(nomeJsonObject).getJSONObject(nomeJsonInterno).getString(nomeAtributo);
		}catch (JSONException e) {
			
		}
		return retorno;
	}
	
	protected String getValorFromJsonArray(JSONObject json,String nomeJsonObject,String nomeAtributo){
		String retorno = "";
		try{
			retorno = ((JSONObject)json.getJSONArray(nomeJsonObject).get(0)).getString(nomeAtributo);
		}catch (JSONException e) {
			
		}
		return retorno;
	}

}
