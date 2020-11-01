package comparableExample.exampleSix;

public class Employee implements Comparable<Employee> {

	String name;
	int age;

	Employee(String name,int age ){
		this.name = name;
		this.age = age;
		
	}
	
	@Override
	public int compareTo(Employee emp) {
		// TODO Auto-generated method stub

		if (this.name == emp.name) {

			return 1;
		}
		if (this.name != emp.name) {

			return 0;
		}

		return -1;
	}

}
