package scenarioBasedExample.castingExample.castingExampleOne;

public class Gas extends Fuel{
	
	void run() {

		System.out.println("Run by gas");
	}

	@Override
	int octaneNumber() {
		// TODO Auto-generated method stub
		//System.out.println(4 );
		return 4;
	}

}
