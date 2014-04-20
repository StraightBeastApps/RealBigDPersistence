package com.straightbeast.realbigd.persistence.dto;

import java.util.Date;

import javax.persistence.Column;

import com.straightbeast.realbigd.persistence.domain.Residential;

public class ResidentialDTO {
	private Long id;
	private Long mlsId;
	private Long listingId;
	private int askingPrice;
	private String address;
	private String addressNumber;
	private String addressDirection;
	private String addressStreet;
	private String address2;
	private String city;
	private String state;
	private String zip;
	private String zip6;
	private int statusCatId;
	private int statusId;
	private String saleRent;
	private int numAcres;
	private int listAgent1;
	private int listOffice1;
	private Date hotSheetDate;
	private Date priceDate;
	private Date updateDate;
	private int pictureCount;
	private Date lastPhotoUpdate;
	private String sqrFtRange;
	private String neighborhood;
	private String county;
	private int yearBuilt;
	private int bedrooms;
	private int bathrooms;
	private String description;
	private String agent;
	private String office;
	private String lastDocUpdate;
	
	public ResidentialDTO(Residential r) {
		this.id = r.getId();
		this.mlsId = r.getMlsId();
		this.listingId = r.getListingId();
		this.askingPrice = r.getAskingPrice();
		this.address = r.getAddress();
		this.addressNumber = r.getAddressNumber();
		this.addressDirection = r.getAddressDirection();
		this.addressStreet = r.getAddressStreet();
		this.address2 = r.getAddress2();
		this.city = r.getCity();
		this.state = r.getState();
		this.zip = r.getZip();
		this.zip6 = r.getZip6();
		this.statusCatId = r.getStatusCatId();
		this.saleRent = r.getSaleRent();
		this.numAcres = r.getNumAcres();
		this.listAgent1 = r.getListAgent1();
		this.listOffice1 = r.getListOffice1();
		this.hotSheetDate = r.getHotSheetDate();
		this.priceDate = r.getPriceDate();
		this.updateDate = r.getUpdateDate();
		this.pictureCount = r.getPictureCount();
		this.lastPhotoUpdate = r.getLastPhotoUpdate();
		this.sqrFtRange = r.getSqrFtRange();
		this.neighborhood = r.getNeighborhood();
		this.county = r.getCounty();
		this.yearBuilt = r.getYearBuilt();
		this.bedrooms = r.getBedrooms();
		this.bathrooms = r.getBathrooms();
		this.description = r.getDescription();
		this.agent = r.getAgent();
		this.office = r.getOffice();
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Long getListingId() {
		return listingId;
	}
	public void setListingId(Long listingId) {
		this.listingId = listingId;
	}
	public int getAskingPrice() {
		return askingPrice;
	}
	public void setAskingPrice(int askingPrice) {
		this.askingPrice = askingPrice;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getAddressDirection() {
		return addressDirection;
	}
	public void setAddressDirection(String addressDirection) {
		this.addressDirection = addressDirection;
	}
	public String getAddressStreet() {
		return addressStreet;
	}
	public void setAddressStreet(String addressStreet) {
		this.addressStreet = addressStreet;
	}
	public String getAddress2() {
		return address2;
	}
	public void setAddress2(String address2) {
		this.address2 = address2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	public String getZip6() {
		return zip6;
	}
	public void setZip6(String zip6) {
		this.zip6 = zip6;
	}
	public int getStatusCatId() {
		return statusCatId;
	}
	public void setStatusCatId(int statusCatId) {
		this.statusCatId = statusCatId;
	}
	public String getSaleRent() {
		return saleRent;
	}
	public void setSaleRent(String saleRent) {
		this.saleRent = saleRent;
	}
	public int getNumAcres() {
		return numAcres;
	}
	public void setNumAcres(int numAcres) {
		this.numAcres = numAcres;
	}
	public Date getHotSheetDate() {
		return hotSheetDate;
	}
	public void setHotSheetDate(Date hotSheetDate) {
		this.hotSheetDate = hotSheetDate;
	}
	public Date getPriceDate() {
		return priceDate;
	}
	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public int getPictureCount() {
		return pictureCount;
	}
	public void setPictureCount(int pictureCount) {
		this.pictureCount = pictureCount;
	}
	public Date getLastPhotoUpdate() {
		return lastPhotoUpdate;
	}
	public void setLastPhotoUpdate(Date lastPhotoUpdate) {
		this.lastPhotoUpdate = lastPhotoUpdate;
	}
	public String getSqrFtRange() {
		return sqrFtRange;
	}
	public void setSqrFtRange(String sqrFtRange) {
		this.sqrFtRange = sqrFtRange;
	}
	public String getNeighborhood() {
		return neighborhood;
	}
	public void setNeighborhood(String neighborhood) {
		this.neighborhood = neighborhood;
	}
	public String getCounty() {
		return county;
	}
	public void setCounty(String county) {
		this.county = county;
	}
	public int getYearBuilt() {
		return yearBuilt;
	}
	public void setYearBuilt(int yearBuilt) {
		this.yearBuilt = yearBuilt;
	}
	public int getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(int bedrooms) {
		this.bedrooms = bedrooms;
	}
	public int getBathrooms() {
		return bathrooms;
	}
	public void setBathrooms(int bathrooms) {
		this.bathrooms = bathrooms;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAgent() {
		return agent;
	}
	public void setAgent(String agent) {
		this.agent = agent;
	}
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}

	public Long getMlsId() {
		return mlsId;
	}

	public void setMlsId(Long mlsId) {
		this.mlsId = mlsId;
	}

	public String getAddressNumber() {
		return addressNumber;
	}

	public void setAddressNumber(String addressNumber) {
		this.addressNumber = addressNumber;
	}

	public String getLastDocUpdate() {
		return lastDocUpdate;
	}

	public void setLastDocUpdate(String lastDocUpdate) {
		this.lastDocUpdate = lastDocUpdate;
	}

	public int getStatusId() {
		return statusId;
	}

	public void setStatusId(int statusId) {
		this.statusId = statusId;
	}

	public int getListAgent1() {
		return listAgent1;
	}

	public void setListAgent1(int listAgent1) {
		this.listAgent1 = listAgent1;
	}

	public int getListOffice1() {
		return listOffice1;
	}

	public void setListOffice1(int listOffice1) {
		this.listOffice1 = listOffice1;
	}

	@Override
	public String toString() {
		return "ResidentialDTO [id=" + id + ", mlsId=" + mlsId + ", listingId="
				+ listingId + ", askingPrice=" + askingPrice + ", address="
				+ address + ", addressNumber=" + addressNumber
				+ ", addressDirection=" + addressDirection + ", addressStreet="
				+ addressStreet + ", address2=" + address2 + ", city=" + city
				+ ", state=" + state + ", zip=" + zip + ", zip6=" + zip6
				+ ", statusCatId=" + statusCatId + ", statusId=" + statusId
				+ ", saleRent=" + saleRent + ", numAcres=" + numAcres
				+ ", listAgent1=" + listAgent1 + ", listOffice1=" + listOffice1
				+ ", hotSheetDate=" + hotSheetDate + ", priceDate=" + priceDate
				+ ", updateDate=" + updateDate + ", pictureCount="
				+ pictureCount + ", lastPhotoUpdate=" + lastPhotoUpdate
				+ ", sqrFtRange=" + sqrFtRange + ", neighborhood="
				+ neighborhood + ", county=" + county + ", yearBuilt="
				+ yearBuilt + ", bedrooms=" + bedrooms + ", bathrooms="
				+ bathrooms + ", description=" + description + ", agent="
				+ agent + ", office=" + office + ", lastDocUpdate="
				+ lastDocUpdate + "]";
	}
	
}
