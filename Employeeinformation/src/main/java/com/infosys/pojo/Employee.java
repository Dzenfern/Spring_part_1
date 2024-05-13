package com.infosys.pojo;

import org.springframework.beans.factory.annotation.Autowired;

import lombok.ToString;

@ToString
public class Employee {

	private int empId;
	private String empName;
	private Address address;
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	@Autowired
	public void setAddress(Address address) {
		this.address = address;
	}

	

}
