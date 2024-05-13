package com.infosys.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationcontext.xml");
		College c1 = context.getBean("college",College.class);
		System.out.println(c1.toString());
		College c2 = context.getBean("college",College.class);
		System.out.println(c2.toString());
		System.out.println(c1==c2);
		
	}
}
