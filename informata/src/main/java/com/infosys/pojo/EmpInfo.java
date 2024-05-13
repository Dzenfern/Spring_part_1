package com.infosys.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EmpInfo {
	
	private int sid;
	private String name;
	private Address address;

}
