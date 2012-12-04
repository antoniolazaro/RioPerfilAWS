package br.com.rio.app.riolegal.service;

import java.util.List;

import org.hibernate.validator.ClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import br.com.rio.app.riolegal.dao.MarcadorDAO;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.vo.ComentarioVO;
import br.com.rio.app.riolegal.vo.MarcadorVO;

@Service
@RemotingDestination
public class MarcadorService extends ServiceAb{
	
	protected MarcadorDAO marcadorDAO;
	private ClassValidator<MarcadorVO> classValidator = new ClassValidator<MarcadorVO>(MarcadorVO.class);
	
	@Autowired(required=true)
	public void setMarcadorDAO(MarcadorDAO marcadorDAO) {
		this.marcadorDAO = marcadorDAO;
	}
	
	@RemotingInclude
	public MarcadorVO save(MarcadorVO object) throws AplicacaoException {
		validarCampos(classValidator.getInvalidValues(object));
		return marcadorDAO.save(object);
	}
	
	@RemotingInclude
	public List<MarcadorVO> findByFilter(MarcadorVO object) throws AplicacaoException {
		return marcadorDAO.findByFilter(object);
	}
	
	@RemotingInclude
	public MarcadorVO findByPrimaryKey(MarcadorVO object) throws AplicacaoException {
		return marcadorDAO.findByPrimaryKey(object.getId());
	}
	
	@RemotingInclude
	public List<MarcadorVO> findAll() throws AplicacaoException {
		return marcadorDAO.findAll();
	}
	
	@RemotingInclude
	public List<MarcadorVO> findByLatitudeLongitude(String latitude,String longitude) throws AplicacaoException {
		return marcadorDAO.findByLatitudeLongitude(latitude,longitude);
	}
	
	
	@RemotingInclude
	public MarcadorVO calcularMediaComentariosMarcador(MarcadorVO marcadorVO) throws AplicacaoException {
		marcadorVO = marcadorDAO.findByPrimaryKey(marcadorVO.getId());
		return calcularMediaComentarios(marcadorVO);
	}
	
	@RemotingInclude
	public MarcadorVO calcularMediaComentarios(MarcadorVO marcadorVO){
		if(marcadorVO != null && marcadorVO.getListaComentarios() != null && marcadorVO.getListaComentarios().size() > 0){
			double notaTotalComentarios = 0;
			for(ComentarioVO comentarioVO : marcadorVO.getListaComentarios()){
				notaTotalComentarios+= comentarioVO.getNota();
			}
			marcadorVO.setMediaComentarios(notaTotalComentarios/marcadorVO.getListaComentarios().size());
		}
		return marcadorVO;
	}

}
