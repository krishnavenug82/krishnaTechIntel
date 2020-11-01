package scenarioBasedExample.castingExample.castingExampleOne;

public class Kerosine extends Fuel{

	void run() {

		System.out.println("Run by Kerosine");
	}

	@Override
	int octaneNumber() {
		// TODO Auto-generated method stub
		//System.out.println(1 );
		return 1;
	}

}
