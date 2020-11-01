 package singleTonExample.exampleOne;

public class ExampleOne {
	
	static ExampleOne variableOne = new ExampleOne(); // this is used to create instance once 
	
	ExampleTwo variableTwo = new ExampleTwo();
	
	
	
	
	private  ExampleOne(){
		
	}
	
	public ExampleOne getInstance() {
		
		
		
		return variableOne;
	}

	public String customer() {
		
		System.out.println("Good Morning");
		
		return "Good Moring";
	}
}
