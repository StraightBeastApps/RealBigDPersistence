package com.straightbeast.realbigd.persistence.logic;

import java.util.Map;

import com.straightbeast.realbigd.persistence.dto.MLSConfigDTO;

public interface MLSConfigLogic {
	Map<String, MLSConfigDTO> getConfigsForMLS(Long mlsId);
}
