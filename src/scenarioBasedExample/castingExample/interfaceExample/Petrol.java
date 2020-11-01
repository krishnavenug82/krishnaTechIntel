package scenarioBasedExample.castingExample.interfaceExample;

public class Petrol implements Fuel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run by Petrol ");
		
	}

	@Override
	public int octaneNumber() {
		// TODO Auto-generated method stub
		return 3;
	}
}
