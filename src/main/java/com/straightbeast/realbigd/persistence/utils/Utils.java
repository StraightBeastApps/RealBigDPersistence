package com.straightbeast.realbigd.persistence.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Utils {

	public final static ArrayList<String> resedentialColumns = (ArrayList<String>) Arrays.asList("id", "mls_id", "listing_id", "asking_price", "address", "address_number", "address_direction", "address_street", "address2", "city", "state", "zip", "zip6", "status_cat_id", "status_id", "sale_rent", "num_acres", "list_agent1", "list_office1", "hot_sheet_date", "price_date", "update_date", "picture_count", "last_photo_update", "sqr_ft_range", "neighborhood", "county", "year_built", "bedrooms", "bathroomms", "description", "agent", "office");
	
	// At some point this needs to be put into a database table and a dynamic retriever needs to be written
	public final static HashMap<String, String> GREENVILLEMAP = new HashMap<String, String>() {
        {
            put("L_ListingID", "mls_id");
            put("L_AskingPrice", "asking_price");
            put("L_Address", "address");
            put("L_AddressNumber", "address_number");
            put("L_AddressDirection", "address_direction");
            put("L_AddressStreet", "address_street");
            put("L_Address2", "address2");
            put("L_City", "city");
            put("L_State", "state");
            put("L_Zip", "zip");
            put("L_Zip6", "zip6");
            put("L_StatCatID", "status_cat_id");
            put("L_StatusID", "status_id");
            put("L_SaleRent", "sale_rent");
            put("L_NumAcres", "num_acres");
            put("L_ListAgent1", "list_agent1");
            put("L_ListOffice1", "list_office1");
            put("L_HotSheetDate", "hot_sheet_date");
            put("L_PriceDate", "price_date");
            put("L_UpdateDate", "update_date");
            put("L_PictureCount", "picture_count");
            put("L_Last_Photo_updt", "last_photo_update");
            put("LM_Char10_2", "sqr_ft_range");
            put("L_", "neighborhood");
            put("LM_Char10_3", "county");
            put("LM_Int4_1", "year_build");
            put("L_", "bedrooms");
            put("L_", "bathrooms");
            put("LR_remarks22", "description");
            put("L_", "agent");
            put("LO1_OrganizationName", "office");
            put("L_LastDocUpdate", "last_doc_update");
        };
    };
	
}
