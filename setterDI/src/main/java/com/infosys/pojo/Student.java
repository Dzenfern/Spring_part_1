package com.infosys.pojo;

import java.util.List;

import lombok.Data;

@Data
public class Student {

	private int sid;
	private String name;
	private Address addy;
	private List<String> subs;
	
	public void show() {
		for(String x:subs) {
			System.out.println(x);
		}
	}

}
