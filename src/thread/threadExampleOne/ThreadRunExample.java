package thread.threadExampleOne;

public class ThreadRunExample {

	public static void main(String[] args) {
		
		Thread t1 = new Thread(new HeavyWorkRunnable());
		Thread t2 = new Thread(new HeavyWorkRunnable());
		System.out.println("Starting Runnable threads");
		t1.start();
		t2.start();
		System.out.println("Runnable Threads has been started");
		/*Thread t3 = new MyThread("t3");
		Thread t4 = new MyThread("t4");
		System.out.println("Starting MyThreads");
		t3.start();
		t4.start();
		System.out.println("MyThreads has been started");*/
		
/*
		HeavyWorkRunnable a=new HeavyWorkRunnable();
		a.run();
		HeavyWorkRunnable b=new HeavyWorkRunnable();
		b.run();
		HeavyWorkRunnable c=new HeavyWorkRunnable();
		c.run();*/
	}
}