package scenarioBasedExample.castingExample.castingExampleOne;

public class Petrol extends Fuel{

	void run() {

		System.out.println("Run by petrol");
	}

	@Override
	int octaneNumber() {
		// TODO Auto-generated method stub
		//System.out.println(2);
		return 2;
	}

}
