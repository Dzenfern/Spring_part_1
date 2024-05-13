package com.infosys.customer;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		ApplicationContext context = new 
				AnnotationConfigApplicationContext(SpringConfiguration.class);
		
		CustomerService service = (CustomerService)context.getBean("customerService");
		System.out.print(service.createCustomer());
		
		}

}
