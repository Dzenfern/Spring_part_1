package com.infosys.pojo;

import java.util.List;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Student {
	private int sid;
	private String sname;
	private List<String> subjectName;

	public void show() {
		System.out.println(sid+" "+sname);
		for(String sb:subjectName) {
			System.out.println(sb);
		}
	}
}
