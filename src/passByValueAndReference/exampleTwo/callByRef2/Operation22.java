package passByValueAndReference.exampleTwo.callByRef2;

public class Operation22 {

	
	Operation22(Operation2 oper){
		
		oper.data = oper.data + 5000; // Call by reference
		
		Operation2 peration2 = new Operation2();
		int ttt = peration2.data = 10000;
		System.out.println(oper.data);
		System.out.println(ttt);
		
	}
}
