package exceptionExample.exampleOne;

import java.io.IOException;

public class MainClassOne {

	
	public static void main(String args[]) throws Exception  {
		
		ClassOne classOne = new ClassOne();
		classOne.consumer("5656","Krishna");
		
		/*try {
			classOne.consumer("5656","Krishna");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new Exception();
		}*/
	}
}
