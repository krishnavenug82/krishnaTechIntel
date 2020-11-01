package removeDuplicNArrayLst;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee> employee = new ArrayList<Employee>();
		
		Employee emp1 = new Employee("Sriram",788,"Ceo","01-May-2019");
		Employee emp2 = new Employee("Srikrishna",987,"Director","10-Jun-2000");
		Employee emp3 = new Employee("Sriram",788,"Ceo","01-May-2019");
		Employee emp4 = new Employee("Srikrishna",987,"Director","10-Jun-2000");
		Employee emp5 = new Employee("Hanumaam",75,"Cto","20-Nov-1908");
		
		employee.add(emp1);
		employee.add(emp2);
		employee.add(emp3);
		employee.add(emp4);
		employee.add(emp5);

		Set<Object> seen = new HashSet<Object>();
		
		for(Employee ite : employee) {
			
			Employee emp = new Employee(ite);
			
		}
	}

}
