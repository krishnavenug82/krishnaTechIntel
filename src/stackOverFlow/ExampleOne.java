package stackOverFlow;

import java.time.LocalTime;

public class ExampleOne {
	
	static void  consumer() {
		System.out.println("Hello World ");
		 consumer() ;
		while (true) {
			ExampleOne q=new ExampleOne();
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		consumer();
	}
@Override
protected void finalize() throws Throwable {
	// TODO Auto-generated method stub
	super.finalize();
	System.out.println("GC at" + LocalTime.now());
}
}
