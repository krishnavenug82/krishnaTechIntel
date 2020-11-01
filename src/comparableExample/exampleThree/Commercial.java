package comparableExample.exampleThree;

public class Commercial implements Comparable<Commercial> {

	String name;
	int age;
	String location;
	float dob;

	Commercial(String name, int age, String location, float dob) {
		this.name = name;
		this.age = age;
		this.location = location;
		this.dob = dob;
	}

	@Override
	public int compareTo(Commercial o) {
		// TODO Auto-generated method stub
		if (age == o.age)
			return 0;
		else if (age > o.age)
			return 0;
		else
			return -1;
	}

}
