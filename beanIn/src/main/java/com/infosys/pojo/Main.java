package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		Customer cc = context.getBean("customer",Customer.class);
		System.out.println(cc.toString());
		
	}
}
