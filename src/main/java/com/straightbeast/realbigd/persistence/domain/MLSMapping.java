package com.straightbeast.realbigd.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mls_mappings")
public class MLSMapping {
	
	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="mls_id")
	private Long mlsId;
	
	@Column(name="mls_header_name")
	private String mlsHeaderName;
	
	@Column(name="col_name")
	private String columnName;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((columnName == null) ? 0 : columnName.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((mlsHeaderName == null) ? 0 : mlsHeaderName.hashCode());
		result = prime * result + ((mlsId == null) ? 0 : mlsId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MLSMapping other = (MLSMapping) obj;
		if (columnName == null) {
			if (other.columnName != null)
				return false;
		} else if (!columnName.equals(other.columnName))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mlsHeaderName == null) {
			if (other.mlsHeaderName != null)
				return false;
		} else if (!mlsHeaderName.equals(other.mlsHeaderName))
			return false;
		if (mlsId == null) {
			if (other.mlsId != null)
				return false;
		} else if (!mlsId.equals(other.mlsId))
			return false;
		return true;
	}
}
