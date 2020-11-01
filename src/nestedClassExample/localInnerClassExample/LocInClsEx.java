package nestedClassExample.localInnerClassExample;

public class LocInClsEx {
	
	String consumer() {
		
		class ClassTwo{
			
					
			
			void commercial() {
				System.out.println("Hello India");
				
			}
			
			String  clinets (String name ) {
				
				return name;
			}
		
		}
		
		ClassTwo clsTwo = new ClassTwo();
		clsTwo.commercial();
		String user = clsTwo.clinets("Sri");
		
		return user;
	}

}
