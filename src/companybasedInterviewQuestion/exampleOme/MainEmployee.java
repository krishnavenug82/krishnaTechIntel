package companybasedInterviewQuestion.exampleOme;

import java.util.ArrayList;
import java.util.Collections;

public class MainEmployee {
	
	public static void main(String args[]) {
		
		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		Employee empl = new Employee();
		empl.setEmpName("Krisha");
		empl.setEmpId(1001);
		empl.setEmpLoacation("Chennai");
		employee.add(empl);
		
		
		Employee emp2 = new Employee(); 
		emp2.setEmpName("Shiva");
		emp2.setEmpId(1005);
		emp2.setEmpLoacation("Mumbai");
		employee.add(emp2);
		
		employee.sort()
			
		Collections.sort(employee, Collections.reverseOrder());
		
		for(Employee ite : employee) {
			
			
			System.out.println(ite.getEmpName() + "" + ite.getEmpId() + ""+  ite.getEmpLoacation());
			
		}
		
	}
	

}
