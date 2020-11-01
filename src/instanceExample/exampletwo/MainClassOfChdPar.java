package instanceExample.exampletwo;

public class MainClassOfChdPar {
	
	public static void main(String args[]) {
		
		ParentClass upClass = new ChildClass(); 
		
		ParentClass parClass = new ParentClass();
		
		Object obj = new Object();
		 
		//ChildClass dwnClass = (ChildClass) parClass;
		
		
		
		System.out.println(obj instanceof ParentClass);
		
		System.out.println(parClass instanceof ChildClass);
		
		System.out.println(upClass instanceof ParentClass);
	}

}
