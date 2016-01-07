package com.kpeet.Dao;

import java.util.List;

import com.kpeet.springapp.domain.Location;

public interface LocationDao {
	
	public List<Location> getProductList();

    public void saveProduct(Location prod);


}
