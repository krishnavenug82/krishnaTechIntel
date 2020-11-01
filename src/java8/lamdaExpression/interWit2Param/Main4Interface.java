package java8.lamdaExpression.interWit2Param;

import java8.lamdaExpression.comparatorExam.Employee;

public class Main4Interface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IterfaceWit2Param neee = (Employee o1, Employee o2) -> {
			return o1.getAge() - o2.getAge();

		};

	}

}
