package interviewExample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ExampleTwo {

	public static void main(String args[]) {
		
		List<Employee> employee = new ArrayList<Employee>();
		
	for(int i = 0 ; i<10; i++) {
		System.out.println(i);
	}
	}

	

	public class Employee{
			
			String name;
			int age;
			String location;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public int getAge() {
				return age;
			}
			public void setAge(int age) {
				this.age = age;
			}
			public String getLocation() {
				return location;
			}
			public void setLocation(String location) {
				this.location = location;
			}
	
}
}
