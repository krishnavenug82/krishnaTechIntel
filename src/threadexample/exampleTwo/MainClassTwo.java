package threadexample.exampleTwo;

public class MainClassTwo {

	public static void main(String args[]) throws IllegalThreadStateException {
		ClassOne co = new ClassOne();
		Thread t1 = new Thread(co);
		while (true) {
			t1.start();
			
		}

		// t1.stop();

		/*
		 * k n=new k(); n.call();
		 */

	}
}
