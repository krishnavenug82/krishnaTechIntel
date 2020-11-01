package thread.joinThread.withJoin;

public class JTMainClass {
	
	public static void main(String args[]) throws InterruptedException {
		
		Thread thread1 = new Thread(new JTClassOne(), "One");
		thread1.start();
		thread1.join();
				
		Thread thread2 = new Thread(new JTClassTwo(),"Two" );
		thread2.start();
		thread2.join();
		
		Thread thread3 = new Thread(new JTClassThree(),"Three");
		thread3.start();
		thread3.join();
	}

}
