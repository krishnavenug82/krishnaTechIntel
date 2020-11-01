package thread.exampleFour.withThreadUpdated;


public class ThreadClassForMul implements Runnable {

	@Override
	public void run() {

		MulNumber mulNumber = new MulNumber();
		mulNumber.mulNUmber(10, 5);
		
		try {
			Thread.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// TODO Auto-generated method stub

	}

}
