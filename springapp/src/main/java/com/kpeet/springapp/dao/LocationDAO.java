package com.kpeet.springapp.dao;

import java.util.List;

import com.kpeet.springapp.domain.Location;

public interface LocationDAO {
	

		public List<Location> getLocationList();

		public void saveProduct(Location loc);




}
