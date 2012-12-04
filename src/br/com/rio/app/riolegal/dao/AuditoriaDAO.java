package br.com.rio.app.riolegal.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import br.com.rio.app.riolegal.vo.AuditoriaAcessoVO;

@Repository
public class AuditoriaDAO extends AbstractDAO<AuditoriaAcessoVO> {
	
	@Autowired
	public AuditoriaDAO(@Qualifier("hibernateTemplate") HibernateTemplate hibernateTemplate) {
		super.setHibernateTemplate(hibernateTemplate);
	}

}
