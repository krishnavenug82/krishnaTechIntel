package interviewExample.exampleOne;



public class MainClassOne {

	public static void main(String args[]) {

		ExampleOne ageCalculation = new ExampleOne();

		ageCalculation.ageVerification(17);

		String str = new String("krishna");

		String str1 = new String("krishna");

		System.out.println(str == str1);

		System.out.println(str.equals(str1));
	}

}
