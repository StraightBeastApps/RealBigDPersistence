package com.straightbeast.realbigd.persistence.logic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.straightbeast.realbigd.persistence.dao.ResidentialDao;
import com.straightbeast.realbigd.persistence.domain.Residential;
import com.straightbeast.realbigd.persistence.dto.ResidentialDTO;
import com.straightbeast.realbigd.persistence.enums.Operation;
import com.straightbeast.realbigd.persistence.utils.Utils;

@Service
public class ResidentialLogicImpl implements ResidentialLogic{

	@Autowired
	private ResidentialDao residentialDao;
	
	public void saveResidential(Residential r) {
		residentialDao.saveOrUpdate(r);
	}
	
	public Residential findResidentialById(Long id) {
		return residentialDao.findById(id);
	}
	
	public boolean save( ResidentialDTO data ) {
		boolean result = false;
		Residential res = new Residential();
		
		data.getData();
		
		//iterate over data
		for(String element: Utils.GREENVILLEMAP.keySet()){
			
			switch(element){
			case "mls_id":
				res.setMlsId(data.getMlsId());
				break;
			case "asking_price":
				res.setAskingPrice(data.getAskingPrice());
				break;
			case "address":
				res.setAddress(data.getAddress());
				break;
			case "address_number":
				res.setAddressNumber(data.getAddressNumber());
				break;
			case "address_direction":
				res.setAddressDirection(data.getAddressDirection());
				break;
			case "address_street":
				res.setAddressStreet(data.getAddressStreet());
				break;
			case "address2":
				res.setAddress2(data.getAddress2());
				break;
			case "city":
				res.setCity(data.getCity());
				break;
			case "state":
				res.setState(data.getState());
				break;
			case "zip":
				res.setZip(data.getZip());
				break;
			case "zip6":
				res.setZip6(data.getZip6());
				break;
			case "status_cat_id":
				res.setStatusCatId(data.getStatusCatId());
				break;
			case "status_id":
				res.setStatusId(data.getStatusId());
				break;
			case "sale_rent":
				res.setSaleRent(data.getSaleRent());
				break;
			case "num_acres":
				res.setNumAcres(data.getNumAcres());
				break;
			case "list_agent1":
				res.setListAgent1(data.getListAgent1());
				break;
			case "list_office1":
				res.setListOffice1(data.getListOffice1());
				break;
			case "hot_sheet_date":
				res.setHotSheetDate(data.getHotSheetDate());
				break;
			case "price_date":
				res.setPriceDate(data.getPriceDate());
				break;
			case "update_date":
				res.setUpdateDate(data.getUpdateDate());
				break;
			case "picture_count":
				res.setPictureCount(data.getPictureCount());
				break;
			case "last_photo_update":
				res.setLastPhotoUpdate(data.getLastPhotoUpdate());
				break;
			case "sqr_ft_range":
				res.setSqrFtRange(data.getSqrFtRange());
				break;
			case "neighborhood":
				res.setNeighborhood(data.getNeighborhood());
				break;
			case "county":
				res.setCounty(data.getCounty());
				break;
			case "year_build":
				res.setYearBuilt(data.getYearBuilt());
				break;
			case "bedrooms":
				res.setBedrooms(data.getBedrooms());
				break;
			case "bathrooms":
				res.setBathrooms(data.getAskingPrice());
				break;
			case "description":
				res.setDescription(data.getDescription());
				break;
			case "agent":
				res.setAgent(data.getAgent());
				break;
			case "office":
				res.setOffice(data.getOffice());
				break;
			case "last_doc_update":
				res.setLastDocUpdate(data.getLastDocUpdate());
				break;
			default:
				break;
			}
		}
			
		saveResidential(res);
		return result;
	}

	@Override
	public List<ResidentialDTO> ResidentialSearch(String address, Float price,
			Operation op) {
		// TODO Auto-generated method stub
		return null;
	}
}
