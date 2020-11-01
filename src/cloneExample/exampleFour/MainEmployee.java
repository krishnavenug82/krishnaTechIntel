package cloneExample.exampleFour;

public class MainEmployee {
	
	public static void main(String args[]) throws CloneNotSupportedException {
		
		Employee emp = new Employee();
		emp.consumer();
		
		Employee empClone = (Employee) emp.clone(); 
		empClone.consumer();
		
		EmployeeChild empChd = new EmployeeChild();
		empChd.consumer();
		
		EmployeeChild empChdClone = (EmployeeChild) empChd.clone();
		empChdClone.consumer();
		
		
	}

}
