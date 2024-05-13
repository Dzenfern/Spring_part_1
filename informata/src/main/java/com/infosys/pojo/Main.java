package com.infosys.pojo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		EmpInfo ee = context.getBean("empinfo", EmpInfo.class);
		System.out.println(ee.toString());
	}

}
