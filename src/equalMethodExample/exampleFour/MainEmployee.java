package equalMethodExample.exampleFour;

public class MainEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Employee emp = new Employee();
		
		Employee emp1 = new Employee(); 
		
		emp.name="hhgh";
		// When we have two on
		if (emp.equals(emp1)) {
			System.out.println("True of Equal method ");
						
		}else 
			System.out.println("False of Equal method");
	}

}
