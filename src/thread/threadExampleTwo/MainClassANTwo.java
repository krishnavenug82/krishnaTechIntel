package thread.threadExampleTwo;

import oracle.jdbc.OracleTypeMetaData.Array;

public class MainClassANTwo {
	
	public static void main (String args[]) {			
		
		Thread thread1 = new Thread(new threadExampleTwo());		
		Thread thread2 = new Thread(new threadExampleTwo());	
		
		
			
		
		
		thread1.start(); 			
			
		thread2.start();
		
		
		
		
	}
	

}
