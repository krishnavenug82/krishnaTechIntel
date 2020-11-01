package java8.methodReference.exampleTwo;

public class MainClsMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		MethodRefClass fund =  new MethodRefClass();
		
		MethodRefInterface account = fund::commercialFrmCls;
		
		account.consumerFrmInterface();

	}

	
	
	
	
	
}
