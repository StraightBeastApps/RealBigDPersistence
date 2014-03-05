package com.straightbeast.realbigd.persistence.dao;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.DetachedCriteria;
import org.springframework.beans.factory.annotation.Autowired;

@SuppressWarnings("unchecked")
public abstract class GenericDaoImpl<T, I extends Serializable> implements GenericDao<T, I>{

    private Class<T> type;

    @Autowired
    private SessionFactory sessionFactory;
    
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
    
    protected SessionFactory getSessionFactory() {
        if (sessionFactory == null)
            throw new IllegalStateException("SessionFactory has not been set on DAO before usage");
        return sessionFactory;
    }

    public Class<T> getType() {
        return type;
    }

	public GenericDaoImpl() {
        this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T findById(I id) {
        return (T) getSessionFactory().getCurrentSession().get(getType(), id);
    }
    
    public List<T> findAllByCriteria(DetachedCriteria criteria){    	
    	return (List<T>)criteria.getExecutableCriteria(sessionFactory.getCurrentSession()).list();
    }

    public void delete(T obj) {
        getSessionFactory().getCurrentSession().delete(obj);
    }

    public void saveOrUpdate(T obj) {
        getSessionFactory().getCurrentSession().saveOrUpdate(obj);
    }
}
