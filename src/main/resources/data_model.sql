
CREATE TABLE data_stage(id BIGINT, address VARCHAR(100), price REAL);
CREATE SEQUENCE property_id_seq;
CREATE TABLE residential(id BIGINT, listing_id BIGINT, asking_price REAL,address VARCHAR(100),address_number REAL, address_direction VARCHAR(2), address_street VARCHAR(100),address2 VARCHAR(100),city VARCHAR(20), state VARCHAR(2), zip VARCHAR(5), zip6 VARCHAR(5), status_cat_id REAL, status_id REAL, sale_rent VARCHAR(1), num_acres REAL, list_agent1 INTEGER, list_office1 INTEGER, hot_sheet_date TIMESTAMP, price_date TIMESTAMP,update_date TIMESTAMP, picture_count INTEGER, last_photo_update TIMESTAMP, sqr_ft_range VARCHAR(15), neighborhood VARCHAR(25), county VARCHAR(25), year_built INTEGER, bedrooms INTEGER, bathroomms REAL, description VARCHAR(250), agent VARCHAR(30), office VARCHAR(30));
CREATE SEQUENCE residential_id_seq;