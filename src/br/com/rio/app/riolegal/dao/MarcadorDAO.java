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
import br.com.rio.app.riolegal.vo.MarcadorVO;

@Repository
public class MarcadorDAO extends AbstractDAO<MarcadorVO>{

	@Autowired
	public MarcadorDAO(@Qualifier("hibernateTemplate") HibernateTemplate hibernateTemplate) {
		super.setHibernateTemplate(hibernateTemplate);
	}
	
	@SuppressWarnings("unchecked")
	public List<MarcadorVO> findByFilter(MarcadorVO object) throws AmbienteException {
		
		Criteria criteria = getSession().createCriteria(MarcadorVO.class);
		
		if (StringUtils.isNotEmpty(object.getDescricao())) {
			criteria.add(Restrictions.like("descricao", object.getDescricao().toLowerCase(), MatchMode.START).ignoreCase());
		}
		
		
		return criteria.list();
		
	}
	
	public List<MarcadorVO> findByLatitudeLongitude(String latitude,String longitude) throws AmbienteException {
		Criteria criteria = getSession().createCriteria(MarcadorVO.class);
		criteria.add(Restrictions.eq("latitude", latitude));
		criteria.add(Restrictions.eq("longitude", longitude));
		return criteria.list();
	}
}
