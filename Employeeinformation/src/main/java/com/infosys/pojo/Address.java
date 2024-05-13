package com.infosys.pojo;

import lombok.ToString;

@ToString
public class Address {

	private String city;
	private int zipCode;
	public void setCity(String city) {
		this.city = city;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}


	
}
