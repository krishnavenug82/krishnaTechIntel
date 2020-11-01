package toStringEx.exampleOne;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;

public class MainExampleOne {

	public static void main(String args[]) {

		Employee employee = new Employee();
		employee.name = "Krishna";
		employee.age = 12;
		System.out.println(employee);

		Employee employee1 = new Employee();
		employee1.name = "Shiva";
		employee1.age = 22;
		System.out.println(employee1);

		Employee employee2 = new Employee();
		employee2.name = "Bharama";
		employee2.age = 32;
		System.out.println(employee2);

	}

}
