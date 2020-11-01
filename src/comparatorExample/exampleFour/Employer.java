package comparatorExample.exampleFour;

import java.util.Comparator;

public class Employer implements Comparable<Employer> {

	String name;
	int age;

	
	  Employer(String name, int age) { this.name = name; this.age = age; }
	 

	@Override
	public int compareTo(Employer arg0) {
		// TODO Auto-generated method stub
		
		if(age == arg0.age) {
			return 1;
		} else if(age > arg0.age) {
			return 0;
		}
		return -1;
	}

}
