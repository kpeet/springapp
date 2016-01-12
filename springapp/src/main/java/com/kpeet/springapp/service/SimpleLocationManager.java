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
	    public void newLocation(String direccion) {
	       // List<Location> locations = locationDao.getLocationList();
	        Location location_2 = new Location();
	        location_2.setAddress(direccion);
       	 	locationDao.updateLocation(location_2);
       	 	
	        /*
	        if (locations != null) {
	            for (Location location : locations) {
	            	
	            	 
	            	 location.setAddress("alojaaaaa");
	            	 locationDao.saveLocation(location);
					
	               
	            	
	            }
	        }*/
	    }


}
