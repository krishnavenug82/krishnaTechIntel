package java8.lamdaExpression.comparatorExam;

import java.util.ArrayList;
import java.util.Collections;

public class MainClass {

	public static void main(String args[]) {
		ArrayList<Employee> enroll = new ArrayList<Employee>();
		enroll.add(new Employee("Srikrishna", 150, "Chennai"));
		enroll.add(new Employee("Sriradha", 70, "Mumbai"));

		// Without Lambda
		Collections.sort(enroll, new Teacher());
		System.out.println(enroll.toString());

	}

}
