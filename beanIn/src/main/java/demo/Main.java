package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
		College ccCollege = context.getBean("college",College.class);
		ccCollege.test();
		
	}
}
