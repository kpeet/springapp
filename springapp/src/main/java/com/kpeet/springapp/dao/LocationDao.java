package com.kpeet.springapp.dao;

import java.util.List;

import com.kpeet.springapp.domain.Location;

public interface LocationDao {
	
	public List<Location> getLocationList();

    public void saveLocation(Location loc);
    
    public void updateLocation(Location loc);


}
