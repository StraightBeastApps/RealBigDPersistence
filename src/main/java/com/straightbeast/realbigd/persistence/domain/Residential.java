package com.straightbeast.realbigd.persistence.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;


@Entity
@Table(name="residential")
public class Residential {
	
	@Id
	@SequenceGenerator(name="residential_seq_gen", sequenceName="residential_id_seq")
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="residential_seq_gen")
	@Column(name="id")
	private Long id;
	
	@Column(name="mls_id")
	private long mlsId;
	
	@Column(name="listing_id")
	private Long listingId;
	
	@Column(name="asking_price")
	private int askingPrice;
	
	@Column(name="address")
	private String address;
	
	@Column(name="address_direction")
	private String addressDirection;
	
	@Column(name="address_street")
	private String addressStreet;
	
	@Column(name="address2")
	private String address2;
	
	@Column(name="city")
	private String city;
	
	@Column(name="state")
	private String state;
	
	@Column(name="zip")
	private String zip;
	
	@Column(name="zip6")
	private String zip6;
	
	@Column(name="status_cat_id")
	private int statusCatId;
	
	@Column(name="sale_rent")
	private String saleRent;
	
	@Column(name="num_acres")
	private int numAcres;
	
	@Column(name="list_agent1")
	private int listAgent1;
	
	@Column(name="list_office1")
	private int listOffice1;
	
	@Column(name="hot_sheet_date")
	private Date hotSheetDate;
	
	@Column(name="price_date")
	private Date priceDate;
	
	@Column(name="update_date")
	private Date updateDate;
	
	@Column(name="picture_count")
	private int pictureCount;
	
	@Column(name="last_photo_update")
	private Date lastPhotoUpdate;
	
	@Column(name="sqr_ft_range")
	private String sqrFtRange;
	
	@Column(name="neighborhood")
	private String neighborhood;
	
	@Column(name="county")
	private String county;
	
	@Column(name="year_built")
	private int yearBuilt;
	
	@Column(name="bedrooms")
	private int bedrooms;
	
	@Column(name="bathrooms")
	private int bathrooms;
	
	@Column(name="description")
	private String description;
	
	@Column(name="agent")
	private String agent;
	
	@Column(name="office")
	private String office;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result
				+ ((address2 == null) ? 0 : address2.hashCode());
		result = prime
				* result
				+ ((addressDirection == null) ? 0 : addressDirection.hashCode());
		result = prime * result
				+ ((addressStreet == null) ? 0 : addressStreet.hashCode());
		result = prime * result + ((agent == null) ? 0 : agent.hashCode());
		result = prime * result + askingPrice;
		result = prime * result + bathrooms;
		result = prime * result + bedrooms;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((county == null) ? 0 : county.hashCode());
		result = prime * result
				+ ((description == null) ? 0 : description.hashCode());
		result = prime * result
				+ ((hotSheetDate == null) ? 0 : hotSheetDate.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result
				+ ((lastPhotoUpdate == null) ? 0 : lastPhotoUpdate.hashCode());
		result = prime * result + listAgent1;
		result = prime * result + listOffice1;
		result = prime * result
				+ ((listingId == null) ? 0 : listingId.hashCode());
		result = prime * result
				+ ((neighborhood == null) ? 0 : neighborhood.hashCode());
		result = prime * result + numAcres;
		result = prime * result + ((office == null) ? 0 : office.hashCode());
		result = prime * result + pictureCount;
		result = prime * result
				+ ((priceDate == null) ? 0 : priceDate.hashCode());
		result = prime * result
				+ ((saleRent == null) ? 0 : saleRent.hashCode());
		result = prime * result
				+ ((sqrFtRange == null) ? 0 : sqrFtRange.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + statusCatId;
		result = prime * result
				+ ((updateDate == null) ? 0 : updateDate.hashCode());
		result = prime * result + yearBuilt;
		result = prime * result + ((zip == null) ? 0 : zip.hashCode());
		result = prime * result + ((zip6 == null) ? 0 : zip6.hashCode());
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
		Residential other = (Residential) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (address2 == null) {
			if (other.address2 != null)
				return false;
		} else if (!address2.equals(other.address2))
			return false;
		if (addressDirection == null) {
			if (other.addressDirection != null)
				return false;
		} else if (!addressDirection.equals(other.addressDirection))
			return false;
		if (addressStreet == null) {
			if (other.addressStreet != null)
				return false;
		} else if (!addressStreet.equals(other.addressStreet))
			return false;
		if (agent == null) {
			if (other.agent != null)
				return false;
		} else if (!agent.equals(other.agent))
			return false;
		if (askingPrice != other.askingPrice)
			return false;
		if (bathrooms != other.bathrooms)
			return false;
		if (bedrooms != other.bedrooms)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (county == null) {
			if (other.county != null)
				return false;
		} else if (!county.equals(other.county))
			return false;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (hotSheetDate == null) {
			if (other.hotSheetDate != null)
				return false;
		} else if (!hotSheetDate.equals(other.hotSheetDate))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (lastPhotoUpdate == null) {
			if (other.lastPhotoUpdate != null)
				return false;
		} else if (!lastPhotoUpdate.equals(other.lastPhotoUpdate))
			return false;
		if (listAgent1 != other.listAgent1)
			return false;
		if (listOffice1 != other.listOffice1)
			return false;
		if (listingId == null) {
			if (other.listingId != null)
				return false;
		} else if (!listingId.equals(other.listingId))
			return false;
		if (neighborhood == null) {
			if (other.neighborhood != null)
				return false;
		} else if (!neighborhood.equals(other.neighborhood))
			return false;
		if (numAcres != other.numAcres)
			return false;
		if (office == null) {
			if (other.office != null)
				return false;
		} else if (!office.equals(other.office))
			return false;
		if (pictureCount != other.pictureCount)
			return false;
		if (priceDate == null) {
			if (other.priceDate != null)
				return false;
		} else if (!priceDate.equals(other.priceDate))
			return false;
		if (saleRent == null) {
			if (other.saleRent != null)
				return false;
		} else if (!saleRent.equals(other.saleRent))
			return false;
		if (sqrFtRange == null) {
			if (other.sqrFtRange != null)
				return false;
		} else if (!sqrFtRange.equals(other.sqrFtRange))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (statusCatId != other.statusCatId)
			return false;
		if (updateDate == null) {
			if (other.updateDate != null)
				return false;
		} else if (!updateDate.equals(other.updateDate))
			return false;
		if (yearBuilt != other.yearBuilt)
			return false;
		if (zip == null) {
			if (other.zip != null)
				return false;
		} else if (!zip.equals(other.zip))
			return false;
		if (zip6 == null) {
			if (other.zip6 != null)
				return false;
		} else if (!zip6.equals(other.zip6))
			return false;
		return true;
	}

	public long getMlsId() {
		return mlsId;
	}

	public void setMlsId(long mlsId) {
		this.mlsId = mlsId;
	}
	
	
}
