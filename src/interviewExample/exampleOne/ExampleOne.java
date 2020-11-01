package interviewExample.exampleOne;

import interviewExample.exception.InvalidAgeException;

public class ExampleOne {
	
	
	public void ageVerification(int age) {
		if (age<16)
			try {
				throw new InvalidAgeException("Invalid age of voter");
			} catch (InvalidAgeException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

}
