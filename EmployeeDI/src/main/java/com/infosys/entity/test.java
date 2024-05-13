package com.infosys.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		
	
	ApplicationContext context = 
			new ClassPathXmlApplicationContext("config.xml");
	Employee servicEmployee =context.getBean("emp",Employee.class);
	servicEmployee.show();
}
}
