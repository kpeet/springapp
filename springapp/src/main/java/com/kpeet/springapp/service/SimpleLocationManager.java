package com.kpeet.springapp.service;

import java.util.List;

import com.kpeet.springapp.domain.Location;

public class SimpleLocationManager implements LocationManager{
	 private static final long serialVersionUID = 1L;

	    private List<Location> locations;

	    public List<Location> getLocations() {
	        return locations; 
	    }
		
	    public void setLocation(List<Location> locations) {
	        this.locations = locations;
	    }


}
