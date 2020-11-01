package passByValueAndReference.exampleTwo.callByRef2;

public class Operation21 {
	
	public void consumer(Operation2 oo) {
		
		
		Operation2 Operation2 =new Operation2(); 
		System.out.println((100+ Operation2.data));
		System.out.println("HI" + (100+ oo.data));
		System.out.println(Operation2.yy);
		System.out.println("oo.Data == " + oo.data  +" && oo.yy == " + oo.yy);
		
	}

}
