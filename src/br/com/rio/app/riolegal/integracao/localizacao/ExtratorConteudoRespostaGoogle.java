package br.com.rio.app.riolegal.integracao.localizacao;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONObject;

import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.integracao.ExtratorConteudoRespostaJsonAb;
import br.com.rio.app.riolegal.vo.LocalizacaoVO;

public class ExtratorConteudoRespostaGoogle extends ExtratorConteudoRespostaJsonAb{
	
	public List<LocalizacaoVO> extrairConteudoRespostaGeocodeGoogle(String endereco) throws AplicacaoException{
		ConsultorServicoGeocodeGoogle consultorServicoGeocodeGoogle = new ConsultorServicoGeocodeGoogle();
		String resposta = consultorServicoGeocodeGoogle.consultarServicoGeocodeGoogle(endereco);
		return tratarRetornoGoogleGeocodeService(resposta);
	}
	
	public List<LocalizacaoVO> extrairConteudoRespostaGeocodeGoogle(String latitude,String longitude) throws AplicacaoException{
		ConsultorServicoGeocodeGoogle consultorServicoGeocodeGoogle = new ConsultorServicoGeocodeGoogle();
		String resposta = consultorServicoGeocodeGoogle.consultarServicoGeocodeGoogle(latitude,longitude);
		return tratarRetornoGoogleGeocodeService(resposta);
	}
	
	public List<LocalizacaoVO> tratarRetornoGoogleGeocodeService(String conteudoRespostaJson) throws AplicacaoException{
		List<LocalizacaoVO> listaObjetos = new ArrayList<LocalizacaoVO>();
		try{
			JSONObject objetoJSON = new JSONObject(conteudoRespostaJson);
			String status = getValorFromJson(objetoJSON,"status");
			if(validaRetornoServicoGoogle(status)){
				JSONArray results = objetoJSON.getJSONArray("results");
				for(int i=0;i <results.length();i++){
					JSONObject json = (JSONObject) results.get(i);
					LocalizacaoVO localizacaoVO = new LocalizacaoVO();
					localizacaoVO.setEnderecoFormatado(json.getString("formatted_address"));
					localizacaoVO.setType(((JSONObject)json.getJSONArray("address_components").get(0)).getString("types"));
					localizacaoVO.setLongitude(json.getJSONObject("geometry").getJSONObject("location").getString("lng").toString());
					localizacaoVO.setLatitude(json.getJSONObject("geometry").getJSONObject("location").getString("lat").toString());
					listaObjetos.add(localizacaoVO);
				}
			}
		}catch (Exception e) {
			throw new AmbienteException(e.getMessage());
		}
		return listaObjetos;
	}
	
	private boolean validaRetornoServicoGoogle(String status) throws AplicacaoException{
		if(status.equalsIgnoreCase("OK")){
			return true;
		}else if(status.equalsIgnoreCase("ZERO_RESULTS")){
			throw new AplicacaoException("Nenhum resultado para a pesquisa");
		}else if(status.equalsIgnoreCase("OVER_QUERY_LIMIT")){
			throw new AplicacaoException("Solicita‹o ultrapassou a cota m‡xima de requisi›es di‡rias");
		}else if(status.equalsIgnoreCase("REQUEST_DENIED")){
			throw new AplicacaoException("Solicita‹o negada");
		}else if(status.equalsIgnoreCase("INVALID_REQUEST")){
			throw new AplicacaoException("Solicita‹o invalida");
		}else{
			throw new AmbienteException("Erro desconhecido no retorno do Google");
		}
	}
}
