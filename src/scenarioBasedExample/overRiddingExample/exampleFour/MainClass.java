package scenarioBasedExample.overRiddingExample.exampleFour;

import java.io.BufferedReader;
import java.io.IOException;

public class MainClass {
	
	public static void main(String args[]) {
		ChildClass childClass = new ChildClass();
		childClass.methodA();
		try {
			childClass.methodA(15);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		childClass.methodB();
		childClass.methodD();
		childClass.methodE();
		childClass.methodF();	
		
		BufferedReader bf;
	}

}
