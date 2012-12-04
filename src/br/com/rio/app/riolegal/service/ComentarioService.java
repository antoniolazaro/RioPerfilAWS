package br.com.rio.app.riolegal.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.validator.ClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import br.com.rio.app.riolegal.dao.ComentarioDAO;
import br.com.rio.app.riolegal.dao.PalavraProibidaDAO;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.vo.ComentarioVO;
import br.com.rio.app.riolegal.vo.MarcadorVO;
import br.com.rio.app.riolegal.vo.PalavraProibidaVO;
import br.com.rio.app.riolegal.vo.RioDataMineVO;

@Service
@RemotingDestination
public class ComentarioService extends ServiceAb {

	@Autowired(required=true)
	private ComentarioDAO comentarioDAO;
	@Autowired
	private MarcadorService marcadorService;
	@Autowired(required=true)
	private PalavraProibidaDAO palavraProibidaDAO;
	private ClassValidator<ComentarioVO> classValidator = new ClassValidator<ComentarioVO>(ComentarioVO.class);
	
	private boolean validarComentario(ComentarioVO comentarioVO) throws AplicacaoException{
		if(comentarioVO.getMarcadorVO() == null){
			throw new AplicacaoException("N‹o Ž poss’vel inserir um coment‡rio sem associar a uma entidade.");
		}
		if(comentarioVO.getId() == 0){
			comentarioVO.setId(null);
		}
		if(comentarioVO.getMarcadorVO().getId() == 0){
			comentarioVO.getMarcadorVO().setId(null);
		}
		validarCampos(classValidator.getInvalidValues(comentarioVO));
		if(StringUtils.isNotEmpty(comentarioVO.getDescricao())){
			List<PalavraProibidaVO> listaPalavrasProibidas = palavraProibidaDAO.findAll();
			String comentario = comentarioVO.getDescricao().replaceAll(" ","").trim().toUpperCase();
			for(PalavraProibidaVO palavraProibidaVO: listaPalavrasProibidas){
				if(comentario.contains(palavraProibidaVO.getDescricao().toUpperCase())){
					throw new AplicacaoException("Coment‡rio censurado, pois n‹o deve conter palavras proibidas como -> "+palavraProibidaVO.getDescricao());
				}
			}
		}
		return true;
	}
	

	@RemotingInclude
	public ComentarioVO save(ComentarioVO object) throws AplicacaoException{
		validarComentario(object);
		List<MarcadorVO> listaMarcadores = marcadorService.findByLatitudeLongitude(object.getMarcadorVO().getLatitude(), object.getMarcadorVO().getLongitude());
		MarcadorVO marcadorVO = null;
		if(listaMarcadores == null || listaMarcadores.size() == 0){
			marcadorVO = marcadorService.save(object.getMarcadorVO());
		}else{
			marcadorVO = listaMarcadores.get(0);
		}
		
		object.setMarcadorVO(marcadorVO);
		return comentarioDAO.save(object);	
	}
	
	@RemotingInclude
	public List<ComentarioVO> findByFilter(ComentarioVO object) throws AplicacaoException{
		return comentarioDAO.findByFilter(object);
	}
	
	@RemotingInclude
	public ComentarioVO findByPrimaryKey(ComentarioVO object) throws AplicacaoException{
		return comentarioDAO.findByPrimaryKey(object.getId());
	}
	
	@RemotingInclude
	public List<ComentarioVO> findAll() throws AplicacaoException{
		return comentarioDAO.findAll();
	}
	
	@RemotingInclude
	public List<ComentarioVO> findByMarcadorVO(MarcadorVO object) throws AplicacaoException {
		return comentarioDAO.findByMarcadorVO(object);
	}
	
	@RemotingInclude
	public List<ComentarioVO> findByLatitudeLongitude(RioDataMineVO object) throws AplicacaoException {
		return comentarioDAO.findByLatitudeLongitude(object);
	}

	private void setMarcadorVO(RioDataMineVO rioDataMineVO) throws AplicacaoException {
		List<MarcadorVO> listaMarcadores = marcadorService.findByLatitudeLongitude(rioDataMineVO.getLatitude(), rioDataMineVO.getLongitude());
		if(listaMarcadores != null && listaMarcadores.size() > 0){
			rioDataMineVO.setMarcadorVO(listaMarcadores.get(0));
			marcadorService.calcularMediaComentarios(rioDataMineVO.getMarcadorVO());
		}
	}
	
	@RemotingInclude
	public double obterMedia(RioDataMineVO rioDataMineVO) throws AplicacaoException{
		setMarcadorVO(rioDataMineVO);
		return rioDataMineVO.getMarcadorVO().getMediaComentarios();
	}
}
