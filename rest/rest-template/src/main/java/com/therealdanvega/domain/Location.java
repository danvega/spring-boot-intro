package com.therealdanvega.domain;

public class Location {

	private String city;
	private String state;
	private String country;
	
	public Location(){
		
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Location [city=" + city + ", state=" + state + ", country=" + country + "]";
	}
	
	
}
