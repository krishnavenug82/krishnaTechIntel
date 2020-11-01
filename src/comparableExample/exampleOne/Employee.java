package comparableExample.exampleOne;

public class Employee implements Comparable<Employee>{

	int rollno;
	String name;
	int age;

	Employee(int rollno, String name, int age) {

		this.rollno = rollno;
		this.name = name;
		this.age = age;
	}

	@Override
	public int compareTo(Employee arg0) { 
		// TODO Auto-generated method stub
		if(age == arg0.age){
			return 0;
		}else if (age > arg0.age) {
			return 1;
		}else

		return -1;
	}
}
