package beany;

import org.springframework.beans.factory.annotation.Autowired;

public class FirstClass {
	
	@Autowired
	private SecondClass secondClass;
	@Autowired
	private ThirdClass thirdClass;
	
	public FirstClass() {
		System.out.println("Inside First");
	}
	
	public void display() {
		secondClass.show();
		thirdClass.show();
	}
	
	

}
