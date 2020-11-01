package equalMethodExample.equalWithCollections;

import java.util.*; 

public class MainEmployee {
	
	public static void main(String args[]) {
		
		Employee emp = new Employee();
		emp.setEmpName("Srikrishna");
		emp.setEmpId(20);
		emp.setEmpLocation("Tirunelveli");
		
		Employee emp1 = new Employee();
		emp1.setEmpName("Krishna");
		emp1.setEmpId(16);
		emp1.setEmpLocation("Chennai");
		
		List<Employee> a =new ArrayList<Employee>();
	
		a.add(emp);
		a.add(emp1);
		
		
		
		for(Employee ite : a) {
			System.out.println(ite.getEmpName()+ "\n" + ite.getEmpLocation()+"\n" + ite.getEmpId());
		}
		
	}

}
