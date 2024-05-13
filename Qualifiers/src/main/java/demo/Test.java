package demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		Profile pf1 = context.getBean("profile",Profile.class);
		pf1.printName();
		pf1.printAge();
	}
}
