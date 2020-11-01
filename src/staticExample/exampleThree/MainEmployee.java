package staticExample.exampleThree;

public class MainEmployee {
	
	public static void main(String args[]) {
		
		Employee emp1 = new Employee();
		System.out.println( " emp1 = " + emp1.hashCode());
		
		
		Employee emp2 = new Employee();
		System.out.println( " emp2 = " + emp2.hashCode());
	}

}
