package com.kpeet.springapp.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="location") 
public class Location implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @Column(name = "location_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	private int location_id;
	private String address;
	private String street_number;
	private String route;
	private String locality;
	private String administrative_area_level_1;
	private String country;
	private double latitude;
	private double longitude;
	private int meterPerHour;
	
	
	
	public int getLocation_id() {
		return location_id;
	}
	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getStreet_number() {
		return street_number;
	}
	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}
	public String getRoute() {
		return route;
	}
	public void setRoute(String route) {
		this.route = route;
	}
	public String getLocality() {
		return locality;
	}
	public void setLocality(String locality) {
		this.locality = locality;
	}
	public String getAdministrative_area_level_1() {
		return administrative_area_level_1;
	}
	public void setAdministrative_area_level_1(String administrative_area_level_1) {
		this.administrative_area_level_1 = administrative_area_level_1;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public double getLatitude() {
		return latitude;
	}
	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}
	public double getLongitude() {
		return longitude;
	}
	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}
	public int getMeterPerHour() {
		return meterPerHour;
	}
	public void setMeterPerHour(int meterPerHour) {
		this.meterPerHour = meterPerHour;
	}
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("latitude: " + latitude + ";");
        buffer.append("longitude: " + longitude);
        return buffer.toString();
    }


}
