package br.com.rio.app.riolegal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.integracao.riodatamineservices.ConsultorServicosRioDataMine;
import br.com.rio.app.riolegal.integracao.riodatamineservices.ExtratorConteudoRespostaRioDataMine;
import br.com.rio.app.riolegal.vo.MarcadorVO;
import br.com.rio.app.riolegal.vo.ParametrosVO;
import br.com.rio.app.riolegal.vo.RioDataMineVO;

@Service
@RemotingDestination
public class RioDataMineService {
	
	@Autowired
	private MarcadorService marcadorService;

	private void setMarcadorVO(List<RioDataMineVO> listaRetorno) throws AplicacaoException {
		for(RioDataMineVO rioDataMineVO :listaRetorno){
			setMarcadorVO(rioDataMineVO);
		}
	}
	
	private void setMarcadorVO(RioDataMineVO rioDataMineVO) throws AplicacaoException {
		List<MarcadorVO> listaMarcadores = marcadorService.findByLatitudeLongitude(rioDataMineVO.getLatitude(), rioDataMineVO.getLongitude());
		if(listaMarcadores != null && listaMarcadores.size() > 0){
			rioDataMineVO.setMarcadorVO(listaMarcadores.get(0));
			try{
				marcadorService.calcularMediaComentarios(rioDataMineVO.getMarcadorVO());
				
				//teste 2
	//			MarcadorVO marcadorVO = rioDataMineVO.getMarcadorVO();
	//			if(marcadorVO != null && marcadorVO.getListaComentarios() != null && marcadorVO.getListaComentarios().size() > 0){
	//				double notaTotalComentarios = 0;
	//				for(ComentarioVO comentarioVO : marcadorVO.getListaComentarios()){
	//					notaTotalComentarios+= comentarioVO.getNota();
	//				}
	//				marcadorVO.setMediaComentarios(notaTotalComentarios/marcadorVO.getListaComentarios().size());
//				}
			}catch (Exception e) {
				e.printStackTrace();
				throw new AmbienteException(e.getMessage());
			}
		}
	}
	
	@RemotingInclude
	public double obterMedia(RioDataMineVO rioDataMineVO) throws AplicacaoException{
		setMarcadorVO(rioDataMineVO);
		return rioDataMineVO.getMarcadorVO().getMediaComentarios();
	}
	
	private List<RioDataMineVO> prepararListaRetorno(String resposta) throws Exception{
		ExtratorConteudoRespostaRioDataMine extratorConteudoRespostaRioDataMine = new ExtratorConteudoRespostaRioDataMine();
		List<RioDataMineVO> listaRetorno = extratorConteudoRespostaRioDataMine.tratarRetornoRioDataMineService(resposta);
		setMarcadorVO(listaRetorno);
		return listaRetorno;
	}
	/**
	 * 
	 * @param servico - Url do servico a ser invocado
	 * @param format - json ou kml (suportados pela API riodatamine)
	 * @param parametros - consultar documentacao do servico em questao
	 * @return
	 * @throws Exception
	 */
	@RemotingInclude
	public List<RioDataMineVO> consultarServicoRioDataMine(String servico,ParametrosVO parametros) throws Exception{
		ExtratorConteudoRespostaRioDataMine extratorConteudoRespostaRioDataMine = new ExtratorConteudoRespostaRioDataMine();
		List<RioDataMineVO> listaRetorno = extratorConteudoRespostaRioDataMine.extrairConteudoRespostaRioDataMine(servico, parametros);
		setMarcadorVO(listaRetorno);
		return listaRetorno;
	}
	
	/**
	 * 
	 * @param parametros - parametros aceitos:
	 * search
	 * location
	 * radius
	 * neighbourhood
	 * @return
	 * @throws Exception
	 */
	@RemotingInclude
	public List<RioDataMineVO> consultarServicoCorpoBombeiro(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/corpos-bombeiros",parametros);
		return prepararListaRetorno(resposta);
	}
	
	/**
	 * 
	 * @param parametros - parametros aceitos:
	 * search
	 * location
	 * radius
	 * neighbourhood
	 * @return
	 * @throws Exception
	 */
	@RemotingInclude
	public List<RioDataMineVO> consultarServicoDelegaciaPolicia(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/delegacias-policiais",parametros);
		return prepararListaRetorno(resposta);
	}
	
	/**
	 * 
	 * @param parametros - parametros aceitos:
	 * search
	 * location
	 * radius
	 * neighbourhood
	 * @return
	 * @throws Exception
	 */
	@RemotingInclude
	public List<RioDataMineVO> consultarServicoEscolas(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/escolas",parametros);
		return prepararListaRetorno(resposta);
	}
	
	/**
	 * 
	 * @param parametros - parametros aceitos:
	 * search
	 * location
	 * radius
	 * neighbourhood
	 * @return
	 * @throws Exception
	 */
	@RemotingInclude
	public List<RioDataMineVO> consultarServicoUnidadesSaude(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/unidades-saude",parametros);
		return prepararListaRetorno(resposta);
	}
	
	/**
	 * 
	 * @param parametros - parametros aceitos:
	 * location
	 * radius
	 * neighbourhood
	 * @return
	 * @throws Exception
	 */
	@RemotingInclude
	public List<RioDataMineVO> consultarServicoBanheirosCemusa(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/banheiros-cemusa",parametros);
		return prepararListaRetorno(resposta);
	}
	
	/**
	 * 
	 * @param parametros - parametros aceitos:
	 * search
	 * location
	 * radius
	 * neighbourhood
	 * @return
	 * @throws Exception
	 */
	@RemotingInclude
	public List<RioDataMineVO> consultarServicoJogosOlimpicos(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/infraestruturas/jogos-olimpicos",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarComlurbFrotaLimpezaUrbana(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/comlurb-frota-limpeza-urbana",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarObrasEmergenciais(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/obras/emergenciais",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarServicosCentral1746(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/central-atendimento-1746",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarObrasPublicas(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/obras/publicas",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarObrasLicenciadas(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/obras/licenciadas",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarLogradouros(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/prefeitura/logradouros",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarEscolasDeSamba(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/escolas-de-samba",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarEventos(ParametrosVO parametros) throws Exception{
//		if(StringUtils.isEmpty(parametros.getDataInicio())){
//			Date date = Calendar.getInstance().getTime();
//			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//			parametros.setDataInicio(formatter.format(date));
//		}
//			
//		if(StringUtils.isEmpty(parametros.getDataFim())){
//			Calendar calendar = Calendar.getInstance();
//			calendar.add(Calendar.DATE,3);
//			Date date = calendar.getTime();
//			SimpleDateFormat formatter = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
//			parametros.setDataFim(formatter.format(date));
//		}
			
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/eventos",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarOndeComer(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/onde-comer",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarOndeDormir(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/onde-dormir",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarOndeOQueFazer(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/o-que-fazer",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarPraias(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/visitar-rio/praias",parametros);
		return prepararListaRetorno(resposta);
	}
	
	@RemotingInclude
	public List<RioDataMineVO> consultarPontosDeAlagamento(ParametrosVO parametros) throws Exception{
		ConsultorServicosRioDataMine consultorServicosRioDataMine = new ConsultorServicosRioDataMine();
		String resposta = consultorServicosRioDataMine.consultaServicoRioDataMine("/rest/agua/pontos-alagamento",parametros);
		return prepararListaRetorno(resposta);
	}

}
