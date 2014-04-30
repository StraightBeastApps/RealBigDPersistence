package com.straightbeast.realbigd.persistence.dto;


public class MLSMappingDTO {	
	private Long mlsId;
	private String mlsHeaderName;
	private String columnName;
	
	public Long getMlsId() {
		return mlsId;
	}
	public void setMlsId(Long mlsId) {
		this.mlsId = mlsId;
	}
	public String getMlsHeaderName() {
		return mlsHeaderName;
	}
	public void setMlsHeaderName(String mlsHeaderName) {
		this.mlsHeaderName = mlsHeaderName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
}
