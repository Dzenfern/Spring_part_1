package com.infosys.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {

	public static void main(String[] args) {
		ApplicationContext context =new ClassPathXmlApplicationContext("config.xml");
		ReportService reportService = context.getBean("reportService",ReportService.class);
		reportService.display();
	}
	
}
