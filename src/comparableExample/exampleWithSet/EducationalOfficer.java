package comparableExample.exampleWithSet;

import java.util.Set;

public class EducationalOfficer {
	
	public static void main(String args[]) {
		
		Principal reportBySchool = new Principal();
		Set<Student> deoReport = reportBySchool.studentReport();
		
		for (Student ite : deoReport) {
			
			System.out.println(ite.getStudentAge());
			
		}
		
	}

}
