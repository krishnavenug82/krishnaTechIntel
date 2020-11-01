package scenarioBasedExample.overRiddingExample.exampleFour;

import java.io.IOException;
import java.sql.SQLException;

public class ParentClass { 
	
	public void methodA() throws IOException{
		  
		System.out.println( "Parent MethodA");
	}

	public void methodA(int d) throws IOException{
		
		System.out.println( "Parent MethodA");
	}
	
	static public void methodB() {
		
		System.out.println( "Parent static MethodB");
	}
	
	 public  void methodD() {
		
		System.out.println( "Parent Final MethodD");
	}
	
	 public  void methodE() {
			
			System.out.println( "Parent Final MethodE");
		}
	 
	 public  char  methodF() {
			
			System.out.println( "Parent Chile Final MethodF");
			
			return 0;
		}
}
