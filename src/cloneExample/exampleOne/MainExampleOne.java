package cloneExample.exampleOne;

public class MainExampleOne {

	public static void main(String args[]) throws CloneNotSupportedException {

		ExampleOne exampleOne = new ExampleOne(101, "amit");
		ExampleOne exampleTwo = (ExampleOne) exampleOne.clone();

		System.out.println(exampleOne.name + "\n" + exampleOne.rollno);
		System.out.println(exampleTwo.name + "\n" + exampleTwo.rollno);

	}
}
