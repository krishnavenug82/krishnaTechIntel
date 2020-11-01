package innerClassExample.exampleTwo;

import innerClassExample.exampleTwo.ClassTwo.ClassTwoSub;

public class MainClassTwo {
	
	public static void main (String args[]) {
		
		ClassTwo classTwo = new ClassTwo();
		classTwo.addConsumer();
		
		ClassTwoSub classTwoSub = classTwo.new ClassTwoSub();
		classTwoSub.addConsumerSub();
		
		
		ClassTwo.ClassTwoSub.ClassTwoSubSub Cl = classTwoSub.new ClassTwoSubSub();
		Cl.addConsumerSubSub();
	}

}
