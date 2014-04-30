package com.straightbeast.realbigd.persistence.dto;

import com.straightbeast.realbigd.persistence.domain.MLSConfig;


public class MLSConfigDTO {
	
	private Long mlsId;
	private String property;
	private String value;
	
	public MLSConfigDTO(){}
	public MLSConfigDTO(MLSConfig config){
		this.mlsId = config.getMlsId();
		this.property = config.getProperty();
		this.value = config.getValue();
	}
	
	public Long getMlsId() {
		return mlsId;
	}
	public void setMlsId(Long mlsId) {
		this.mlsId = mlsId;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}	
}
