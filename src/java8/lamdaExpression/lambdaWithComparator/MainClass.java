package java8.lamdaExpression.lambdaWithComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MainClass {

	public static void main(String args[]) {
		ArrayList<Employee> enroll = new ArrayList<Employee>();
		enroll.add(new Employee("Srikrishna", 150, "Chennai"));
		enroll.add(new Employee("Sriradha", 70, "Mumbai"));

		// Without Lambda
		 Collections.sort(enroll, (Comparator<Employee o1>) (Comparator<? super T>) (, Employee o2) -> {
			 
		 });

		System.out.println(enroll.toString());
		
		Comparator<Employee> com1 = (Employee o1, Employee o2) -> {
			// TODO Auto-generated method stub
			return o1.getAge() - o2.getAge();
		};

		Comparator<Employee> com = new Comparator<Employee>() {

			@Override
			public int compare(Employee o1, Employee o2) {
				// TODO Auto-generated method stub
				return o1.getAge() - o2.getAge();
			}

		};

	}

}
