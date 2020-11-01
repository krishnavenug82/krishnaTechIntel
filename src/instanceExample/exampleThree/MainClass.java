package instanceExample.exampleThree;

public class MainClass {
	
	static Employee emp;
	
	public static void main (String args[]) {
		
		ClassA varClassA = new ClassA();
		varClassA.methodA(emp, 12);		
		System.out.println(emp instanceof Employee);
	}

}
