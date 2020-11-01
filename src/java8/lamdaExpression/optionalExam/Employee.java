package java8.lamdaExpression.optionalExam;

import java.util.Optional;

public class Employee {

	public static String empName(String empName) {

		/*if (empName == null)
			empName = Optional.empty().toString();*/

		return empName;
	}

	public static void main(String args[]) {
		String fullName = null;
		Optional<String> a = null;

		String firstname = empName(null);
		System.out.println(firstname);

		if (firstname == null)
			Optional<String> a  = Optional.ofNullable(firstname);

		if (firstname.equals("Srikrishna"))

			fullName = firstname + "Jee";

		System.out.println(fullName);
	}

}
