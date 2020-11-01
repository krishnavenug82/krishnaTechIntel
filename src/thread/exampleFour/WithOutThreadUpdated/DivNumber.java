package thread.exampleFour.WithOutThreadUpdated;

import java.util.concurrent.TimeUnit;

public class DivNumber {
	
public int divNUmber (int a, int b ) {
	try {
		TimeUnit.SECONDS.sleep(20);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
		System.out.println( "Div number " + (a/b));
		
		return a/b;
	}

}
