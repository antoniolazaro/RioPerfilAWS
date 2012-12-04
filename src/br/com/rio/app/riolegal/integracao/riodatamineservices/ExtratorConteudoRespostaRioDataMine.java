package br.com.rio.app.riolegal.integracao.riodatamineservices;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

import br.com.rio.app.riolegal.integracao.ExtratorConteudoRespostaJsonAb;
import br.com.rio.app.riolegal.vo.ParametrosVO;
import br.com.rio.app.riolegal.vo.RioDataMineVO;

public class ExtratorConteudoRespostaRioDataMine extends ExtratorConteudoRespostaJsonAb {

	public List<RioDataMineVO> extrairConteudoRespostaRioDataMine(String servico,ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine(servico,parametros);
		return tratarRetornoRioDataMineService(resposta);
	}

	public List<RioDataMineVO> tratarRetornoRioDataMineService(String conteudoRespostaJson) throws Exception{
//		System.out.println("resposta JSON -> "+conteudoRespostaJson);
		List<RioDataMineVO> listaObjetos = new ArrayList<RioDataMineVO>();
		JSONObject objetoJSON = new JSONObject(conteudoRespostaJson);
		JSONArray results = objetoJSON.getJSONArray("results");
		for(int i=0;i <results.length();i++){
			JSONObject json = (JSONObject) results.get(i);
			RioDataMineVO rioDataMineVO = new RioDataMineVO();
			rioDataMineVO.setNomeObjeto(getValorFromJson(json,"name"));
			String descricao = getValorFromJson(json,"description","text");
			if(StringUtils.isNotEmpty(descricao) && StringUtils.contains(descricao,"<")){
				descricao = descricao.replaceAll("\\<[^>]*>"," ");
			}
			
			if(StringUtils.isEmpty(descricao)){
				descricao = getValorFromJson(json,"description","link");
			}
			
			rioDataMineVO.setDescricao(descricao);
			rioDataMineVO.setDescricaoResumida(getValorFromJson(json,"description","short_text"));
			rioDataMineVO.setInformationUrl(getValorFromJson(json,"description","information_urls"));
			rioDataMineVO.setIlustrationIcon(getValorFromJson(json,"ilustration","icon"));
			rioDataMineVO.setIlustrationColour(getValorFromJson(json,"ilustration","colour"));
			rioDataMineVO.setEmail(getValorFromJson(json, "contactData","email"));
			rioDataMineVO.setWebSite(getValorFromJson(json, "contactData","website"));
			rioDataMineVO.setTelefone(getValorFromJson(json, "contactData","phone"));
			rioDataMineVO.setInformacoesGerais(getValorFromJson(json, "characteristics","general_info"));
			rioDataMineVO.setOrganizacao(getValorFromJson(json, "characteristics","organization"));
			rioDataMineVO.setLocal(getValorFromJson(json, "characteristics","local"));
			
			rioDataMineVO.setUrlDivulgacao(getValorFromJsonArray(json, "files","file"));
			
			rioDataMineVO.setTipoTaxomomia(getValorFromJsonArray(json,"taxonomies","type"));
			rioDataMineVO.setValorTaxonomia(getValorFromJsonArray(json,"taxonomies","value"));
			
			rioDataMineVO.setBairro(getValorFromJson(json, "geoResult","neighbourhood"));
			rioDataMineVO.setEndereco(getValorFromJson(json, "geoResult","address"));
			rioDataMineVO.setLatitude(json.getJSONObject("geoResult").getJSONObject("point").getString("lat").toString());
			rioDataMineVO.setLongitude(json.getJSONObject("geoResult").getJSONObject("point").getString("lng").toString());
			rioDataMineVO.setDistanciaCalculada(getValorFromJson(json, "geoResult","distance"));
			
			listaObjetos.add(rioDataMineVO);
		}
		return listaObjetos;
	}
	
	
}
