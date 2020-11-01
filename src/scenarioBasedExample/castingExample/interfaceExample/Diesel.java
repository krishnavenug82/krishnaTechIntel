package scenarioBasedExample.castingExample.interfaceExample;

public class Diesel implements Fuel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run by Diesel ");
		
	}

	@Override
	public int octaneNumber() {
		// TODO Auto-generated method stub
		return 4;
	}

}
