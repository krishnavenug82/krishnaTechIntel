package scenarioBasedExample.overRiddingExample.exampleFour;

import java.io.IOException;

public class ChildClass extends ParentClass{
	
public void methodA() {
		
		System.out.println( "Chile MethodA");
	}

	public void methodA(int d) throws IOException{
		
		System.out.println( "Chile MethodA");
	}
	
	static public void methodB() {
		
		System.out.println( "Chile static MethodB");
	}
	
	 public  void methodD() {
		
		System.out.println( "Chile Final MethodD");
	}
	
	 public final void methodE() {
			
			System.out.println( "Chile Final MethodE");
		}
	  
	 /*public  int  methodF() {
			
			System.out.println( "Chile Final MethodF");
			
			return 0;
		}*/

}
