package thread.exampleFive;

public class ExampleOne implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ExampleTwo exampleTwo = new ExampleTwo();
		exampleTwo.consumer();
		
	}

}
