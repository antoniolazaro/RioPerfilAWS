package br.com.rio.app.riolegal.dao;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.Criteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.com.rio.app.riolegal.exception.AmbienteException;
import br.com.rio.app.riolegal.vo.ComentarioVO;
import br.com.rio.app.riolegal.vo.MarcadorVO;
import br.com.rio.app.riolegal.vo.RioDataMineVO;

@Repository
public class ComentarioDAO extends AbstractDAO<ComentarioVO> {

	@Autowired
	public ComentarioDAO(@Qualifier("hibernateTemplate") HibernateTemplate hibernateTemplate) {
		super.setHibernateTemplate(hibernateTemplate);
	}
	
	@SuppressWarnings("unchecked")
	public List<ComentarioVO> findByFilter(ComentarioVO object) throws AmbienteException {
		
		Criteria criteria = getSession().createCriteria(ComentarioVO.class);
		
		if (StringUtils.isNotEmpty(object.getDescricao())) {
			criteria.add(Restrictions.like("descricao", object.getDescricao().toLowerCase(), MatchMode.START).ignoreCase());
		}
		
		return criteria.list();
		
	}
	
	public List<ComentarioVO> findByMarcadorVO(MarcadorVO object) throws AmbienteException {
		Criteria criteria = getSession().createCriteria(ComentarioVO.class);
		criteria.add(Restrictions.eq("marcadorVO.id", object.getId()));
		return criteria.list();
	}
	
	public List<ComentarioVO> findByLatitudeLongitude(RioDataMineVO object) throws AmbienteException {
		Criteria criteria = getSession().createCriteria(ComentarioVO.class).addOrder(Order.asc("dataCriacao"));
		criteria.createCriteria("usuarioVO");
		criteria.createCriteria("marcadorVO").add(Restrictions.eq("latitude", object.getLatitude())).add(Restrictions.eq("longitude", object.getLongitude()));
		return criteria.list();
	}
}
