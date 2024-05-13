package com.infosys.pojo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.infosys.pojo")
public class config {

	@Bean
	public Mobile iphone() {
		Mobile d1 = new Mobile();
		d1.setName("Iphone7");
		d1.setPrice(1200);
		d1.setBatteryCapacity(4500);
		return d1;
	}
	
	@Bean
	public Mobile mi() {
		Mobile d1 = new Mobile();
		d1.setName("mi7");
		d1.setPrice(500);
		d1.setBatteryCapacity(4500);
		return d1;
	}
	
	@Bean
	public Mobile moto() {
		Mobile d1 = new Mobile();
		d1.setName("edge40");
		d1.setPrice(600);
		d1.setBatteryCapacity(3500);
		return d1;
	}
}
