package beany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;

@Configuration
public class config {
	
	@Bean
	@DependsOn(value= {"secondClass","thirdClass"})
	public FirstClass firstClass() {
		return new FirstClass();
	}
	
	@Bean
	public SecondClass secondClass() {
		return new SecondClass();
	}
	@Bean
	public ThirdClass thirdClass() {
		return new ThirdClass();
	}
}
