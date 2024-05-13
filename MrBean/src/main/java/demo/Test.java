package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		Address adr = context.getBean("address",Address.class);
		System.out.println(adr.toString());
		
	}
}
