package exceptionExample.exampleOne;

import java.io.IOException;

import org.springframework.util.SystemPropertyUtils;

public class ClassOne {
	
	
	public void consumer(String name, String pwd) throws Exception   {
		
		if (!name.matches(".*[a-z].*")) {
			
			System.out.println("Other than character");
			
			throw new Exception();
		} 
			
		System.out.println("");
	
	}

}
