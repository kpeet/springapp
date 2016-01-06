package com.kpeet.springapp.dao;

import java.util.List;

import com.kpeet.springapp.domain.Location;

public interface LocationDao {
	
	public List<Location> getProductList();

    public void saveProduct(Location  loc);

	

}
