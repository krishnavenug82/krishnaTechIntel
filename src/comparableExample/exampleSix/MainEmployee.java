package comparableExample.exampleSix;

import java.util.ArrayList;
import java.util.List;

public class MainEmployee {
	
	public static void main(String args[]) {
		
		List<Employee> arrlst = new ArrayList<Employee>();
		arrlst.add(new Employee("Krishna",152));
		arrlst.add(new Employee("Krishna",500));
		
		for(Employee ite : arrlst) {
		System.out.println(ite.name + "" + ite.age);
		}
	}

}
