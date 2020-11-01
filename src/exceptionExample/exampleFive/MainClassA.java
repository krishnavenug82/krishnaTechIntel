package exceptionExample.exampleFive;

import java.io.IOException;

public class MainClassA {

	public static void emiCalculation() {

		ClassA clsA = new ClassA();
		clsA.consumer();
	}

	public static void interestCalculation() throws Exception {
		ClassA clsA = new ClassA();
		clsA.commercial(); 
	}
	
	public static void main(String args[]) {
		emiCalculation();

	}

}
