package instanceExample.hashCodeOverRid.exampleTwo;

import java.util.HashMap;
import java.util.Map;

public class MainEmployee {

	public static void main(String args[]) {
		
		SalaryPoint varA = new SalaryPoint(); 
		SalaryPoint varb = new SalaryPoint(); 

		Employee emp1 = new Employee(1);
		Employee emp2 = new Employee(1);

		Map<Employee, String> map1 = new HashMap<Employee, String>();
		map1.put(emp1, "Krishna");
		map1.put(emp2, "Krishna");

		System.out.println("Map1 " + map1.size());

		Integer int1 = new Integer(1);
		Integer int2 = new Integer(1);

		System.out.println("int1.hashCode " + int1.hashCode() + " , " + int2.hashCode());

		Map<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(int1, "Shiva");
		map2.put(int2, "Shiva");

		System.out.println("Map2 " + map2.size());

		Employer emplo = new Employer(1);
		Employer emplo1 = new Employer(100, "SriKrishna");
		Employer emplo2 = new Employer(1500);
		Employer emplo3 = new Employer(1500);

		System.out.println("emplo :  " + emplo.hashCode() + "emplo1 : " + emplo1.hashCode() + "emplo2 : " + emplo2.hashCode());
		
		
		System.out.println(varA.equals(varb));
		
		System.out.println(emplo2.equals(emplo3));		
		System.out.println(emplo2.hashCode() == emplo3.hashCode());
		
		System.out.println(int1.equals(int1));
		System.out.println(int1.hashCode() == int1.hashCode()); 
		
	

	}

}
