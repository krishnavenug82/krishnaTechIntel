package thread.exampleFour.WithOutThreadUpdated;

import java.util.concurrent.TimeUnit;

public class SubNumber {
	
public int subNUmber (int a, int b ) {
	try {
		TimeUnit.SECONDS.sleep(20);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		
		System.out.println( "Sub number " + (a-b));
		
		return a-b;
	}

}
