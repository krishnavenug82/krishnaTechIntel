package cloneExample.exampleFive;

public class Consumer implements Commercial{

	@Override
	public void consumer() {
		System.out.println("Hi");
		
	}

	@Override
	@Deprecated
	public void producer() throws Exception {
		//return ;
		//Do not use this methods
		throw new Exception();
		
	}

	@Override
	public String request() throws Exception {
		// TODO Auto-generated method stub
		throw new Exception() ;
	}

}
