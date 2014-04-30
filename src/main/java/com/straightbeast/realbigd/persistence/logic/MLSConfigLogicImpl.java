package com.straightbeast.realbigd.persistence.logic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.straightbeast.realbigd.persistence.dao.MLSConfigDao;
import com.straightbeast.realbigd.persistence.domain.MLSConfig;
import com.straightbeast.realbigd.persistence.dto.MLSConfigDTO;

@Service
public class MLSConfigLogicImpl implements MLSConfigLogic{
	@Autowired
	private MLSConfigDao mlsConfigDao;

	@Override
	public Map<String, MLSConfigDTO> getConfigsForMLS(Long mlsId) {
		DetachedCriteria dc = DetachedCriteria.forClass(MLSConfig.class);
		dc.add(Restrictions.eq("mlsId", mlsId));
		
		List<MLSConfig> configs = mlsConfigDao.findAllByCriteria(dc);
		Map<String, MLSConfigDTO> configMap;
		if(configs != null){
			configMap = new HashMap<>(configs.size());
			for(MLSConfig config : configs){
				configMap.put(config.getProperty(), new MLSConfigDTO(config));
			}
		} else{
			configMap = new HashMap<>(0);
		}
		
		return configMap;
	}
	
	
}
