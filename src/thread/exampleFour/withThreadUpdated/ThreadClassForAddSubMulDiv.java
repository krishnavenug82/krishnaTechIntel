package thread.exampleFour.withThreadUpdated;

import thread.exampleFour.WithOutThread.AddNumber;
import thread.exampleFour.WithOutThread.DivNumber;
import thread.exampleFour.WithOutThread.MulNumber;
import thread.exampleFour.WithOutThread.SubNumber;

public class ThreadClassForAddSubMulDiv implements Runnable {
	
	

	@Override
	public void run() {
		AddNumber addNumber = new AddNumber ();
		addNumber.addNUmber(10, 5);
				
		SubNumber subNumber = new SubNumber();
		subNumber.subNUmber(10, 5);
		
		MulNumber mulNumber = new MulNumber();
		mulNumber.mulNUmber(10, 5);
		
		DivNumber divNUmber = new DivNumber();
		divNUmber.divNUmber(10, 5);
		
		
		
		// TODO Auto-generated method stub
		
	}

}
