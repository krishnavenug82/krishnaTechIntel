package thread.joinThread.withJoin;

public class JTClassTwo implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		Thread t = Thread.currentThread();
		System.out.println("Welcome JT Class Two Started " + t.getName());
		
		try {
			t.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Welcome JT Class Two Ended " + t.getName());
	}

}
