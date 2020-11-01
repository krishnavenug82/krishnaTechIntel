package passByValueAndReference.exampleTwo.CallByValue;

public class MainClassOne {
	
	public static void main (String args[]) {
		
		ClassOne classOne = new ClassOne();
		classOne.yy = 50; 
		
		ClassOne classOne1 = new ClassOne();
		
		
		System.out.println(classOne.yy = 100); 
		System.out.println(classOne1.yy);
		
	}

}
