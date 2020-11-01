package comparableExample.exampleWithSet;

import java.util.HashSet;
import java.util.Set;

public class Principal {
	
	public Set<Student> studentReport() {
		
		Set <Student> studentReport = new HashSet<Student>();
		studentReport.add(new Student());
		
		 return studentReport;
	}

}
