package optinalclassDemo;

import java.util.Optional;

public class OptinalClassExample {

	String  str = null;
	
	
	void consumer() {
		
		
		
		if (Optional.ofNullable(str).isPresent())
			System.out.println("String is not null");
		
		else System.out.println("String is null");
		
	}	
	
}
