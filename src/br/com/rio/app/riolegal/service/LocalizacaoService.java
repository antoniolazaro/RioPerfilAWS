package br.com.rio.app.riolegal.service;

import java.util.List;

import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import br.com.rio.app.riolegal.integracao.localizacao.ExtratorConteudoRespostaGoogle;
import br.com.rio.app.riolegal.vo.LocalizacaoVO;

@Service
@RemotingDestination
public class LocalizacaoService {
	
	@RemotingInclude
	public List<LocalizacaoVO> consultarServicoGeocodeGoogle(String endereco) throws Exception{
		ExtratorConteudoRespostaGoogle extratorConteudoRespostaGoogle = new ExtratorConteudoRespostaGoogle();
		List<LocalizacaoVO> listaRetorno = extratorConteudoRespostaGoogle.extrairConteudoRespostaGeocodeGoogle(endereco);
		return listaRetorno;
	}
	
	@RemotingInclude
	public List<LocalizacaoVO> consultarServicoGeocodeGoogle(String latitude,String longitude) throws Exception{
		ExtratorConteudoRespostaGoogle extratorConteudoRespostaGoogle = new ExtratorConteudoRespostaGoogle();
		List<LocalizacaoVO> listaRetorno = extratorConteudoRespostaGoogle.extrairConteudoRespostaGeocodeGoogle(latitude,longitude);
		return listaRetorno;
	}
}
