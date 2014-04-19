package com.straightbeast.realbigd.persistence.logic;

import java.util.List;

import com.straightbeast.realbigd.persistence.domain.Residential;
import com.straightbeast.realbigd.persistence.dto.ResidentialDTO;
import com.straightbeast.realbigd.persistence.enums.Operation;

public interface ResidentialLogic {
	public void saveResidential(Residential r);
	public Residential findResidentialById(Long id);
	public List<ResidentialDTO> ResidentialSearch(String address, Float price, Operation op);
}
