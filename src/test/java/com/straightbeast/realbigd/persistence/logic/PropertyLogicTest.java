package com.straightbeast.realbigd.persistence.logic;

import java.util.List;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.straightbeast.realbigd.persistence.base.BaseTestClass;
import com.straightbeast.realbigd.persistence.domain.Property;
import com.straightbeast.realbigd.persistence.enums.Operation;
import com.straightbeast.realbigd.persistence.logic.PropertyLogic;

public class PropertyLogicTest extends BaseTestClass{
	
	@Autowired
	private PropertyLogic propertyLogic;
	
	@Test
	public void testSaveProperty() throws Exception {
		Property p1 = new Property();
		p1.setAddress("1657 Estes Dr");
		p1.setPrice(new Float(100000.0));
		
		Property p2 = new Property();
		p2.setAddress("1600 Pennsylvania Ave");
		p2.setPrice(new Float(1750000.0));
		
		Property p3 = new Property();
		p3.setAddress("1667 Estes Dr");
		p3.setPrice(new Float(75000.0));
		
		propertyLogic.saveProperty(p1);
		propertyLogic.saveProperty(p2);
		propertyLogic.saveProperty(p3);
		
		List<Property> search;
		
		search = propertyLogic.propertySearch("estes", null, null);
		Assert.assertEquals(2, search.size());
		Assert.assertEquals(p3, search.get(0));
		Assert.assertEquals(p1, search.get(1));
		
		search = propertyLogic.propertySearch(null, new Float(1000000.0), Operation.GREATER_THAN);
		Assert.assertEquals(1, search.size());
		Assert.assertEquals(p2, search.get(0));
		
		search = propertyLogic.propertySearch("estes", new Float(100000.0), Operation.LESS_THAN);
		Assert.assertEquals(1, search.size());
		Assert.assertEquals(p3, search.get(0));		
	}
}
