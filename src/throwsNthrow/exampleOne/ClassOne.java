package throwsNthrow.exampleOne;

public class ClassOne {

	public int sumation(int a, int b) {
		// int c = 0;
		int c = a * b;
		if (c == 0) {
			throw new ArithmeticException();
		}

		return c;
	}

	public int subtraction(int a, int b) throws Exception {

		int c = a / b;

		throw new Exception();
		// return c;
	}
	
	public String multi(String name, int age) {
		
		if(name.equals("Srikrishna")) {
			
			throw new Exception();
		}
	  if(age == 100) {
		
		throw new ArithmeticException();
	}
}
