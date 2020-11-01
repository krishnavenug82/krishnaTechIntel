package threadexample.exampleTwo;

import java.time.LocalDate;

public class ClassOne implements Runnable {

	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(" Welcome");
		
		/*while(true) {
			System.out.println("from thread "+LocalDate.now());
		}
		*/
	}
	
}
