package br.com.rio.app.riolegal.service;

import java.util.Date;
import java.util.List;

import org.hibernate.validator.ClassValidator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.flex.remoting.RemotingDestination;
import org.springframework.flex.remoting.RemotingInclude;
import org.springframework.stereotype.Service;

import br.com.rio.app.riolegal.dao.AuditoriaDAO;
import br.com.rio.app.riolegal.dao.UsuarioDAO;
import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.exception.AplicacaoException;
import br.com.rio.app.riolegal.vo.AuditoriaAcessoVO;
import br.com.rio.app.riolegal.vo.UsuarioVO;

@Service
@RemotingDestination
public class UsuarioService extends ServiceAb{
	
	protected UsuarioDAO usuarioDAO;
	
	@Autowired
	private AuditoriaDAO auditoriaDAO;
	
	private ClassValidator<UsuarioVO> classValidator = new ClassValidator<UsuarioVO>(UsuarioVO.class);
	
	@Autowired(required=true)
	public void setUsuarioDAO(UsuarioDAO usuarioDAO) {
		this.usuarioDAO = usuarioDAO;
	}
	
	@RemotingInclude
	public UsuarioVO save(UsuarioVO object) throws AplicacaoException{
		validarCampos(classValidator.getInvalidValues(object));
		return usuarioDAO.save(object);	
	}
	
	@RemotingInclude
	public List<UsuarioVO> findByFilter(UsuarioVO object) throws AplicacaoException{
		List<UsuarioVO> lista = usuarioDAO.findByFilter(object);
		return lista;
	}
	
	@RemotingInclude
	public UsuarioVO findByPrimaryKey(UsuarioVO object) throws AplicacaoException{
		return usuarioDAO.findByPrimaryKey(object.getId());
	}
	
	@RemotingInclude
	public List<UsuarioVO> findAll() throws AplicacaoException{
		List<UsuarioVO> lista = usuarioDAO.findAll();
		return lista;
	}
	
	@RemotingInclude
	public List<UsuarioVO> autenticarUsuario(UsuarioVO object) throws AmbienteException {
		
		List<UsuarioVO> listaUsuarios = usuarioDAO.autenticarUsuario(object);
		if(listaUsuarios.size() == 1){
			UsuarioVO usuarioVO = listaUsuarios.get(0);
			try{
				AuditoriaAcessoVO acessoVO = new AuditoriaAcessoVO();
				acessoVO.setDataAcesso(new Date());
				acessoVO.setUsuarioVO(usuarioVO);
				auditoriaDAO.save(acessoVO);
			}catch (Exception e) {
				e.printStackTrace();
			}
		}
		return listaUsuarios;
	}

}
