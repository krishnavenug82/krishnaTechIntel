package thread.exampleFour.withThreadUpdated;


public class ThreadClassForDiv implements Runnable {

	@Override
	public void run() {

		DivNumber divNUmber = new DivNumber();
		divNUmber.divNUmber(10, 5);
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

	}

}
