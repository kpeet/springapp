package com.kpeet.springapp.domain;

public class Location {
	private String address;
	private String administrative_area_level_1;
	private String country;
	private Double latitude;
	private String locality;
	private int location_id;
	private Double longitude;
	private int meterPerHour;
	private String route;
	private String street_number;

	public String getAddress() {
		return address;
	}

	public String getAdministrative_area_level_1() {
		return administrative_area_level_1;
	}

	public String getCountry() {
		return country;
	}

	public Double getLatitude() {
		return latitude;
	}

	public String getLocality() {
		return locality;
	}

	public int getLocation_id() {
		return location_id;
	}

	public Double getLongitude() {
		return longitude;
	}

	public int getMeterPerHour() {
		return meterPerHour;
	}

	public String getRoute() {
		return route;
	}

	public String getStreet_number() {
		return street_number;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setAdministrative_area_level_1(String administrative_area_level_1) {
		this.administrative_area_level_1 = administrative_area_level_1;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public void setLocation_id(int location_id) {
		this.location_id = location_id;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public void setMeterPerHour(int meterPerHour) {
		this.meterPerHour = meterPerHour;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public void setStreet_number(String street_number) {
		this.street_number = street_number;
	}

}
