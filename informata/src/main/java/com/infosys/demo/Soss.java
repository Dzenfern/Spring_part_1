package com.infosys.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Soss {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Emp eee = context.getBean("emp",Emp.class);
		System.out.println(eee.toString());
		
	}
}
