package instanceExample.exampleThree;

public class ClassA {

	public void methodA(Employee e, int i) {
		
		Object intt = (Integer) i;  
		
		if (e instanceof Employee) 
			System.out.println("e instance of employee");
			System.out.println(e instanceof Employee );
		
	       	
		//if (intt instanceof Integer)System.out.println(intt instanceof Integer);
	}
	
	
	
	
	public void methodB(Employee emp, int j) {		
		if (emp != null)  System.out.println("This is an objective type");
		 	if (j >0 )	System.out.println("This is a primitive type ");
		 		else  System.out.println("No Object & No Primitive");;
	} 
}
