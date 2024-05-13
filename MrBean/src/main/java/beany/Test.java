package beany;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context = new AnnotationConfigApplicationContext(config.class);
		FirstClass ffClass = context.getBean("firstClass",FirstClass.class);
		ffClass.display();
		
	}
}
