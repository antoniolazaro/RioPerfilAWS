package br.com.rio.app.riolegal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import br.com.rio.app.riolegal.dao.ContadorAcessoDAO;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.vo.ContadorAcessoVO;

@Service
@RemotingDestination
public class ContadorAcessoService {

	@Autowired
	private ContadorAcessoDAO contadorAcessoDAO;
	
	@RemotingInclude
	public ContadorAcessoVO save(ContadorAcessoVO object) throws AplicacaoException{
		return contadorAcessoDAO.save(object);	
	}
}
