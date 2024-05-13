package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Employee e1 = context.getBean("employee",Employee.class);
		System.out.println(e1.toString());
		
	}
}
