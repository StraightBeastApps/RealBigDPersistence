package com.straightbeast.realbigd.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="mls_config")
public class MLSConfig {

	@Id
	@Column(name="id")
	private Long id;
	
	@Column(name="mls_id")
	private Long mlsId;
	
	@Column(name="property")
	private String property;
	
	@Column(name="value")
	private String value;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((mlsId == null) ? 0 : mlsId.hashCode());
		result = prime * result
				+ ((property == null) ? 0 : property.hashCode());
		result = prime * result + ((value == null) ? 0 : value.hashCode());
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
		MLSConfig other = (MLSConfig) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (mlsId == null) {
			if (other.mlsId != null)
				return false;
		} else if (!mlsId.equals(other.mlsId))
			return false;
		if (property == null) {
			if (other.property != null)
				return false;
		} else if (!property.equals(other.property))
			return false;
		if (value == null) {
			if (other.value != null)
				return false;
		} else if (!value.equals(other.value))
			return false;
		return true;
	}
}
