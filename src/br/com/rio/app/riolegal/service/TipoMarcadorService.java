package br.com.rio.app.riolegal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import br.com.rio.app.riolegal.dao.TipoMarcadorDAO;
import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.vo.TipoMarcadorVO;

@Service
@RemotingDestination
public class TipoMarcadorService {

	protected TipoMarcadorDAO tipoMarcadorDAO;
	
	@Autowired(required=true)
	public void setTipoMarcadorDAO(TipoMarcadorDAO TipoMarcadorDAO) {
		this.tipoMarcadorDAO = TipoMarcadorDAO;
	}
	
	@RemotingInclude
	public TipoMarcadorVO save(TipoMarcadorVO object) throws AplicacaoException{
		return tipoMarcadorDAO.save(object);
		
	}
	
	@RemotingInclude
	public List<TipoMarcadorVO> findByFilter(TipoMarcadorVO object) throws AplicacaoException{
		return tipoMarcadorDAO.findByFilter(object);
	}
	
	@RemotingInclude
	public TipoMarcadorVO findByPrimaryKey(TipoMarcadorVO object) throws AplicacaoException{
		return tipoMarcadorDAO.findByPrimaryKey(object.getId());
	}
	
	@RemotingInclude
	public List<TipoMarcadorVO> findAll() throws AplicacaoException{
		return tipoMarcadorDAO.findAll();
	}
}
