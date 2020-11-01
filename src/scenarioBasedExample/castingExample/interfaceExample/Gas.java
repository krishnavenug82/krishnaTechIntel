package scenarioBasedExample.castingExample.interfaceExample;

public class Gas implements Fuel{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Run by Gas ");
		
	}

	@Override
	public int octaneNumber() {
		// TODO Auto-generated method stub
		return 2;
	}

}
