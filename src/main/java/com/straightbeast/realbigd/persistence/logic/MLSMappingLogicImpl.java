package com.straightbeast.realbigd.persistence.logic;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.straightbeast.realbigd.persistence.dao.MLSMappingDao;
import com.straightbeast.realbigd.persistence.domain.MLSMapping;

@Service
public class MLSMappingLogicImpl implements MLSMappingLogic{
	@Autowired
	private MLSMappingDao mlsMappingDao;

	@Override
	public Map<String, String> getMappingsForMLS(Long mlsId) {
		DetachedCriteria dc = DetachedCriteria.forClass(MLSMapping.class);
		dc.add(Restrictions.eq("mlsId", mlsId));
		
		List<MLSMapping> mappings = mlsMappingDao.findAllByCriteria(dc);
		Map<String, String> mappingsDTO;
		if(mappings != null){
			mappingsDTO = new HashMap<>(mappings.size());
			for(MLSMapping mapping : mappings){
				mappingsDTO.put(mapping.getMlsHeaderName(), mapping.getColumnName());
			}
		} else{
			mappingsDTO = new HashMap<>(0);
		}
		
		return mappingsDTO;
	}
}
