package thread.threadExampleSix;

import thread.threadExampleSix.service.Regular;

public class ExampleSixMain {

	public static void main(String args[]) {	
		
		Regular regularFlow = new Regular();
		regularFlow.commercial(); 
		
 		while (true) {
			System.out.println(" Tread  ; Lord Krishna");
		}
		
		
		
		/*GenericThreads threadFlow = new GenericThreads();		
		Thread t1 = new Thread(threadFlow);		
		t1.start();*/
		
	}
		

}
