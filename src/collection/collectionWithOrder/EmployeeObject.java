package collection.collectionWithOrder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeObject{
	
	public static void main(String args[]) {
		List<Employee> employee = new ArrayList<Employee>();
		employee.add(new Employee("Srikrishna",120,"Chennai"));
		employee.add(new Employee("Radha",110,"Mumbai"));
		employee.add(new Employee("Rama",115,"Pune"));
		employee.add(new Employee("Seetha",12,"Gurgon"));
		
		List<SortableEmployee> employee1 = new ArrayList<SortableEmployee>();
		employee1.add(new SortableEmployee("Srikrishna",120,"Chennai"));
		employee1.add(new SortableEmployee("Radha",110,"Mumbai"));
		employee1.add(new SortableEmployee("Rama",115,"Pune"));
		employee1.add(new SortableEmployee("Seetha",12,"Gurgon"));
		
		Collections.sort(employee1);
	
		for(Employee ite : employee) {
			System.out.println("Without sorting " + ite.empname + "  " + ite.age + "  " + ite.location );
		}
		
	System.out.println("--------------------------------------------------------------------------------------------------");
		
		for(SortableEmployee ite1 : employee1) {
			System.out.println("With sorting "+ite1.empname + "  " + ite1.age + "  " + ite1.location );
		}
		
	}

}
