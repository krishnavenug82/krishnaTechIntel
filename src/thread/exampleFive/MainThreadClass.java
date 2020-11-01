package thread.exampleFive;

public class MainThreadClass {
	public static void main(String args[]) {
		
		ExampleOne exampleOne = new ExampleOne();
		Thread t1 = new Thread(exampleOne);
		t1.run();
	}

}
