package com.straightbeast.realbigd.persistence.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.criterion.DetachedCriteria;

public interface GenericDao<T , I extends Serializable> {
    public T findById(I id);
    public List<T> findAllByCriteria(DetachedCriteria criteria);
    public void delete(T obj);
    public void saveOrUpdate(T obj);
}