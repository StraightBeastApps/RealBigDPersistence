package com.straightbeast.realbigd.persistence.logic;

import java.util.List;

import com.straightbeast.realbigd.persistence.domain.Property;
import com.straightbeast.realbigd.persistence.enums.Operation;

public interface PropertyLogic {
	public void saveProperty(Property p);
	public Property findPropertyById(Long id);
	public List<Property> propertySearch(String address, Float price, Operation op);
}
