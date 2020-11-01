package passByValueAndReference.exampleTwo.callByRef1;

public class Test1 {

	
	public int cardHolder() {
		Test test = new Test(100,200);
		System.out.println(test.a);
		
		return test.a;
	}
}
