package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Profile {
	
	@Autowired
	@Qualifier("student2")
	private Student student;
	
	public Profile() {
		System.out.println("DEFAULT");
	}			
	
	public void printName() {
		System.out.println("STUDENT AGE :"+student.getName());
		
	}
	
	public void printAge() {
		System.out.println("STUDENT AGE :"+student.getAge());
		
	}
}
