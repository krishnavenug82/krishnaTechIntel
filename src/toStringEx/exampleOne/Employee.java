package toStringEx.exampleOne;

public class Employee {

	String name = "Krishna";
	int age = 52;

	/*
	 * public String toString() { return "This is employee Object where name is  " +
	 * name + "and age is " +age ; }
	 */

	public String addConsumer() {
		return "This is employee Object where name is  " + name + "and age is " + age;
	}

	/*public String toString() {

		return addConsumer();

	}*/
	
	public String toString() {

		return "Sri";

	}
	

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

}
