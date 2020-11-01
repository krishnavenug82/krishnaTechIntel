package java8.lamdaExpression.comparatorExam;

import java.util.Comparator;

public class Teacher implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.getAge() - o2.getAge();
	}

	
	

	

	
	

}
