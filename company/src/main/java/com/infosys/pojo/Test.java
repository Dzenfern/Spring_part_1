package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
	
	ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
	Company cc = context.getBean("company",Company.class);
	cc.display();
	}
}
