package br.com.rio.app.riolegal.dao;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.vo.UsuarioVO;

@Repository
public class UsuarioDAO extends AbstractDAO<UsuarioVO>{

	@Autowired
	public UsuarioDAO(@Qualifier("hibernateTemplate") HibernateTemplate hibernateTemplate) {
		super.setHibernateTemplate(hibernateTemplate);
	}
	
	@SuppressWarnings("unchecked")
	public List<UsuarioVO> findByFilter(UsuarioVO object) throws AmbienteException {
		
		Criteria criteria = getSession().createCriteria(UsuarioVO.class);
		
		if (StringUtils.isNotEmpty(object.getEmail())) {
			criteria.add(Restrictions.eq("email", object.getEmail().toLowerCase()).ignoreCase());
		}
		if (StringUtils.isNotEmpty(object.getNome())) {
			criteria.add(Restrictions.like("nome", object.getNome().toLowerCase(), MatchMode.START).ignoreCase());
		}
		
		return criteria.list();
		
	}
	
	public List<UsuarioVO> autenticarUsuario(UsuarioVO object) throws AmbienteException {
		Criteria criteria = getSession().createCriteria(UsuarioVO.class);
		criteria.add(Restrictions.eq("email", object.getEmail().toLowerCase()).ignoreCase()).add(Restrictions.eq("senha", object.getSenha()));
		List<UsuarioVO> lista = criteria.list();
		return lista;
		
	}
}
