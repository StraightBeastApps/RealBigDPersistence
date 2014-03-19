package com.straightbeast.realbigd.persistence.dto;

import com.straightbeast.realbigd.persistence.domain.Property;

public class PropertyDTO {
	private Long id;
	private String address;
	private Float price;
	
	public PropertyDTO(Property p){
		this.id = p.getId();
		this.address = p.getAddress();
		this.price = p.getPrice();
	}
	
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
		return "PropertyDTO [id=" + id + ", address=" + address + ", price="
				+ price + "]";
	}
}
