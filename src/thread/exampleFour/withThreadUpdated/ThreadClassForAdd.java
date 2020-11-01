package thread.exampleFour.withThreadUpdated;

import thread.exampleFour.WithOutThread.AddNumber;

public class ThreadClassForAdd implements Runnable {

	@Override
	public void run() {
		AddNumber addNumber = new AddNumber();
		addNumber.addNUmber(10, 5);
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

		// TODO Auto-generated method stub

	}

}
