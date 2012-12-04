package br.com.rio.app.riolegal.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class AbstractDAO<T> extends HibernateDaoSupport {

	private Class<T> persistentClass;
	
	@SuppressWarnings("unchecked")   
	public AbstractDAO() {
		this.persistentClass = (Class<T>) ((ParameterizedType) getClass()   
                .getGenericSuperclass()).getActualTypeArguments()[0]; 
	}
	
	public T save(T object) {
		this.getHibernateTemplate().save(object);  
		this.getHibernateTemplate().flush();
	    return object;
	}
	
	public T persist(T object) {
		this.getHibernateTemplate().persist(object);   
		this.getHibernateTemplate().flush();
	    return object;
	}
	
	public T update(T object) {
		this.getHibernateTemplate().update(object);
		this.getHibernateTemplate().flush();
	    return object;
	}
	
	public T merge(T object) {
		this.getHibernateTemplate().merge(object);
		this.getHibernateTemplate().flush();
	    return object;
	}
	
    public void delete(T object) {
		this.getHibernateTemplate().delete(object);
		this.getHibernateTemplate().flush();
	}

	public T findByPrimaryKey(Serializable id) {
		return (T) this.getHibernateTemplate().get(getPersistentClass(), id);   
	}
	
	public List<T> findAll() {
		 return this.getHibernateTemplate().loadAll(getPersistentClass());
	}
	
	public Class<T> getPersistentClass() {   
        return persistentClass;   
    } 
}
