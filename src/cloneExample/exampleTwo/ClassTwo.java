package cloneExample.exampleTwo;

public class ClassTwo {
	
	public static void main(String args[]) {
		ClassOne clsOne = new ClassOne();
		ClassOne clsTwo = (ClassOne) clsOne.clone();
		clsTwo.consumer("Srikrishna");
		
	}

}
