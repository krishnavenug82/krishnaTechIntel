package equalMethodExample.exampleSix;

public class MainEmployee {

	public static void main(String args[]) {
		Employee emp = new Employee();
		emp.empName="SriKrishna";
		Employee emp1 = new Employee();
		emp1.empName="Sriganesh";
		ClassOnee c=new ClassOnee();
		System.out.println(emp.equals(c));
		
		/*if(emp.empName.equals(emp1.empName)){
			System.out.println("Equal methods = "+true);		
		}
		*/
		/*if(emp == emp1) {
			System.out.println("hash code"+true );
		}else 
			System.out.println(false);
	}*/

}
}
