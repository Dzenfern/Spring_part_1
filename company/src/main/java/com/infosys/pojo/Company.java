package com.infosys.pojo;

import java.util.Map;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Company {
	private Map<String, String> employees;

	public void display() {
		for (Map.Entry<String, String> entry : employees.entrySet()) {
			
			System.out.println("EmployeesID:"+entry.getKey()+"\t\tDepartment:"+entry.getValue());
			
		}
	}

}
