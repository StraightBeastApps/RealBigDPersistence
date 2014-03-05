package com.straightbeast.realbigd.persistence.logic;

import java.util.List;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.MatchMode;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.straightbeast.realbigd.persistence.dao.PropertyDao;
import com.straightbeast.realbigd.persistence.domain.Property;
import com.straightbeast.realbigd.persistence.enums.Operation;

@Service
public class PropertyLogicImpl implements PropertyLogic{

	@Autowired
	private PropertyDao propertyDao;
	
	public void saveProperty(Property p) {
		propertyDao.saveOrUpdate(p);
	}

	public Property findPropertyById(Long id) {
		return propertyDao.findById(id);
	}
	
	public List<Property> propertySearch(String address, Float price, Operation op){		
		DetachedCriteria dc = DetachedCriteria.forClass(Property.class);
		dc.addOrder(Order.asc("price"));
		
		if(address != null){
			dc.add(Restrictions.ilike("address", address, MatchMode.ANYWHERE));
		}
		
		if(op != null && price != null){
		switch(op){
			case LESS_THAN:
				dc.add(Restrictions.lt("price", price));
				break;
			case LESS_THAN_EQUAL:
				dc.add(Restrictions.le("price", price));
				break;
			case GREATER_THAN:
				dc.add(Restrictions.gt("price", price));
				break;
			case GREATER_THAN_EQUAL:
				dc.add(Restrictions.ge("price", price));
				break;
			case EQUAL:
				dc.add(Restrictions.eq("price", price));
				break;
			default:
				break;
			}	
		}
		
		return propertyDao.findAllByCriteria(dc);
	}
}
