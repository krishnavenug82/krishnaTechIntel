package scenarioBasedExample.hashCodeCreation.exampleTwo;

import java.util.ArrayList;
import java.util.List;

public class MainClassArray {
	
	public static void main (String args[]) {
		
		List<ArrayClass> arrayLst  = new ArrayList<ArrayClass>();
		
		ArrayClass arrayClass = new ArrayClass();		
		arrayLst.add(arrayClass);
		
		ArrayClass arrayClass1 = new ArrayClass();		
		arrayLst.add(arrayClass1);
		System.out.println("hash code this value = " + arrayClass1.hashCode());
		
		
		ArrayClass arrayClass2 = new ArrayClass();		
		arrayLst.add(arrayClass2);
		
		for(ArrayClass ite : arrayLst) {
			if(ite.hashCode() == arrayClass1.hashCode()) {
				System.out.println("Value from mathced hash code " +  ite.hashCode());
			}
			
			
		}
		
		
	}

}
