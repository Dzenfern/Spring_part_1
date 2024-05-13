package com.infosys.entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class client2 {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigurationData.class);
		Sim simu = context.getBean("sim",Sim.class);
		simu.calling();
		System.out.println("");
		simu.data();
	}
}
