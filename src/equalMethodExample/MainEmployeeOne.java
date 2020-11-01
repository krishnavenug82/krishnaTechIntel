package equalMethodExample;

public class MainEmployeeOne {

	public static boolean bigEmpName() {
		
		EmployeeOne empOne = new EmployeeOne();
		EmployeeOne empTwo = new EmployeeOne();
		

		if ((empOne.empName).equals(empTwo.empName)){
			System.out.println("Empone is big ");
			return true;
			
		} else if ((empOne.empName)!=(empTwo.empName)) {	
			System.out.println("Empone is small ");
		return false;
	} else return false;

	}
	public static void main(String args[]) {

		bigEmpName();
	}

}
