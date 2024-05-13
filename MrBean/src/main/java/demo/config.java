package demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class config {
	
	@Bean
	public Employee employee() {
		Employee emp = new Employee(12, "vhgg", address());
		return emp;
	}

	@Bean
	public Address address() {
		return new Address();
	}
}
