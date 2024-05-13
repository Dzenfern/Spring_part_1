package com.infosys.entity;

import org.springframework.context.annotation.Bean;

public class ConfigurationData {

	@Bean(name="sim")
	public Sim sim() {
		return new Jio();
	}
}
