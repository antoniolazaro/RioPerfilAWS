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
import br.com.rio.app.riolegal.vo.TipoMarcadorVO;

@Repository
public class TipoMarcadorDAO extends AbstractDAO<TipoMarcadorVO> {

	@Autowired
	public TipoMarcadorDAO(
			@Qualifier("hibernateTemplate") HibernateTemplate hibernateTemplate) {
		super.setHibernateTemplate(hibernateTemplate);
	}

	@SuppressWarnings("unchecked")
	public List<TipoMarcadorVO> findByFilter(TipoMarcadorVO object) throws AmbienteException {

		Criteria criteria = getSession().createCriteria(TipoMarcadorVO.class);

		if (StringUtils.isNotEmpty(object.getDescricao())) {
			criteria.add(Restrictions.like("descricao",object.getDescricao().toLowerCase(), MatchMode.START).ignoreCase());
		}
		return criteria.list();
	}
}
