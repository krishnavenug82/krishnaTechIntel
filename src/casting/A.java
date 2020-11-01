package casting;

public class A {
	
	int add (int a, int b) {
		
		System.out.println(" From A");
		
		return a * b;
	}
	
	int add (int a, int b, int c) {
		
		System.out.println(" 2nd value From A ");
		
		return a * b;
	}

}
