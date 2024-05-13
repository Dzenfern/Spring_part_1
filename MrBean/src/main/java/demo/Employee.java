package demo;

import lombok.ToString;

@ToString
public class Employee {
	
	private int eid;
	private String name;
	private Address address;
	
	public Employee(int eid, String name, Address address) {
		super();
		this.eid = eid;
		this.name = name;
		this.address = address;
	}
	
	

}
