package cloneExample.exampleFour;

public class Employee {
	
	
	void consumer() {
			System.out.println("Welcome");
	}
	
	
	public Object clone() throws CloneNotSupportedException {
		
		return super.clone();
		
	}
	

}
