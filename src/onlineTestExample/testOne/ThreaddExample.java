package onlineTestExample.testOne;

public class ThreaddExample implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub

	}

	public static void main(String args[]) {

		ThreaddExample threadExample = new ThreaddExample();
		Thread tt = new Thread(threadExample);
		Thread hh = new Thread(new ThreaddExample());
		tt.start();
	}

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}
}
