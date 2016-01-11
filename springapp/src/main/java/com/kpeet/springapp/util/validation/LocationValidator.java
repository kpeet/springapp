package com.kpeet.springapp.util.validation;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

public class LocationValidator {
	 /** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());

    
    @Min(0)
    @Max(50)
	private double lat;
    private double lon;
   
    public double getLat() {
		return lat;
	}
	
    public void setLat(double lat) {
		this.lat = lat;
	}
	
	public double getLon() {
		return lon;
	}
	
	public void setLon(double lon) {
		this.lon = lon;
	}
}
