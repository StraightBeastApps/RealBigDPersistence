package com.straightbeast.realbigd.persistence.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.straightbeast.realbigd.persistence.dao.ResidentialDao;
import com.straightbeast.realbigd.persistence.domain.Property;
import com.straightbeast.realbigd.persistence.domain.Residential;

@Service
public class ResidentialLogicImpl {

	@Autowired
	private ResidentialDao residentialDao;
	
	public void saveResidential(Residential r) {
		residentialDao.saveOrUpdate(r);
	}
	
	public Residential findResidentialById(Long id) {
		return residentialDao.findById(id);
	}
	
	
	
	
}
