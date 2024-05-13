package demo;

import org.springframework.beans.factory.annotation.Value;

import lombok.ToString;

@ToString
public class Address {
	
	 private String city;
	 private int zipcode;

	public String getCity() {
		return city;
	}

	@Value("bjhgdch")
	public void setCity(String city) {
		this.city = city;
	}

	public int getZipcode() {
		return zipcode;
	}
	
	@Value("678879")
	public void setZipcode(int zipcode) {
		this.zipcode = zipcode;
	}
}
