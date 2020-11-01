package java8.methodReference.methodRefExam;

public class Employees {

	
	public static void address(String t) {
		// TODO Auto-generated method stub				
		System.out.println("Value form static Method :- " + t);				
	}
	

	public void salary(String t) {
		// TODO Auto-generated method stub				
		System.out.println("Value form regular Method :- " + t);				
	}

	public static String department(String t, String i) {
		// TODO Auto-generated method stub				
	//	System.out.println("Value form static Method :- " + t + "" + i);
		
		if (t.equals("Srikrishna")&& i.equals("Sriradha")){
			return t+i;
		}else 
			return "No value ";
	}
}
