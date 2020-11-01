package thread.exampleFour.withThreadUpdated;


public class ThreadClassForSub implements Runnable {

	@Override
	public void run() {

		SubNumber subNumber = new SubNumber();
		subNumber.subNUmber(10, 5);
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

	}

}
