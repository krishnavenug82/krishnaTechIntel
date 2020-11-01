package innerClassExample.exampleOne;

public class ClassOne {
	
	public String customer (String name ) {
		
		
		class ClassTwo{
			
			public String commercial (String name) {
				
				System.out.println("Second Classs ");
				
				return name;
			}
			
		} ClassTwo classTo = new ClassTwo();
		  classTo.commercial("Krishna");
		
		
		return classTo.commercial("Krishna"); 
	}
	
	

}
