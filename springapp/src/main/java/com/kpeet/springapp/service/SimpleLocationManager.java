package com.kpeet.springapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kpeet.springapp.dao.LocationDao;
import com.kpeet.springapp.domain.Location;

@Service
public class SimpleLocationManager implements LocationManager{
	 private static final long serialVersionUID = 1L;

	 
	 	@Autowired
	 	LocationDao locationDao;
	 	
	 	
	    private List<Location> locations;

	    public List<Location> getLocations() {
	    	
	    	List<Location> _locations = locationDao.getLocationList();
	    	
	        return _locations; 
	    }
		
	    public void setLocation(List<Location> locations) {
	        this.locations = locations;
	    }


}
