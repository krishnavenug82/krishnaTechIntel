package staticExample.staticBlock;

import static staticExample.staticBlock.Employee.name;
import static staticExample.staticBlock.Employee.location;
import static staticExample.staticBlock.Employee.age;
import static staticExample.staticBlock.Employee.consumer;

public class MainEmployeeEg {

	public static void main(String[] args) {

		name = "Srikrishan";
		location = "Chennai";
		age = 125;

		consumer(15);
		
	Employee emp = new Employee();
	
		
		System.out.println(emp.a == emp.b );
		System.out.println(emp.equals(emp));

		System.out.println("name = " + name + " loc = " + location + " age = " + age);
	}

}
