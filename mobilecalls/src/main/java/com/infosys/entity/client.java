package com.infosys.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Sim sim1 = context.getBean("sim",Sim.class);
		sim1.calling();
		System.out.println('\n');
		sim1.data();
		
	}
}
