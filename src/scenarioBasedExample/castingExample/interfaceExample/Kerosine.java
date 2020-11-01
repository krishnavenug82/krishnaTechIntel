package scenarioBasedExample.castingExample.interfaceExample;

public class Kerosine implements Fuel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run by Kerosine ");
		
		
	}

	@Override
	public int octaneNumber() {
		// TODO Auto-generated method stub
		return 1;
	}

}
