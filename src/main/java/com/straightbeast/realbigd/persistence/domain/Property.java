package com.straightbeast.realbigd.persistence.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.straightbeast.realbigd.persistence.dto.PropertyDTO;

@Entity
@Table(name="data_stage")
public class Property {

	@Id
	@SequenceGenerator(name="property_seq_gen", sequenceName="property_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="property_seq_gen")
	@Column(name="id")
	private Long id;
	
	@Column(name="address")
	private String address;
	
	@Column(name="price")
	private Float price;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Property [id=" + id + ", address=" + address + ", price="
				+ price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass() && obj.getClass() != PropertyDTO.class)
			return false;
		
		if(obj instanceof Property){
			Property other = (Property) obj;
			if (address == null) {
				if (other.address != null)
					return false;
			} else if (!address.equals(other.address))
				return false;
			if (id == null) {
				if (other.id != null)
					return false;
			} else if (!id.equals(other.id))
				return false;
			if (price == null) {
				if (other.price != null)
					return false;
			} else if (!price.equals(other.price))
				return false;
			return true;
		} else if(obj instanceof PropertyDTO){
			PropertyDTO other = (PropertyDTO) obj;
			if (address == null) {
				if (other.getAddress() != null)
					return false;
			} else if (!address.equals(other.getAddress()))
				return false;
			if (id == null) {
				if (other.getId() != null)
					return false;
			} else if (!id.equals(other.getId()))
				return false;
			if (price == null) {
				if (other.getPrice() != null)
					return false;
			} else if (!price.equals(other.getPrice()))
				return false;
			return true;
		}
		return false;
	}
}
