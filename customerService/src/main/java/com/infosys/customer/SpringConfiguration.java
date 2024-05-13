package com.infosys.customer;

import org.springframework.context.annotation.Bean;

public class SpringConfiguration {
	
	@Bean(name="customerService")
	public CustomerServiceImpl customerServiceImpl() {
		return new CustomerServiceImpl();
	}

}
