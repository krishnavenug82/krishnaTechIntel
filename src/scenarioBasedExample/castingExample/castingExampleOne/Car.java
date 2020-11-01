package scenarioBasedExample.castingExample.castingExampleOne;

public class Car {

	/*void run(input type inputvariable) {  Exected Secnarios 
		inputvariable.run();
	}*/
	
	void run(Fuel inputvariable ) {
		inputvariable.run();
		int tt = inputvariable.octaneNumber() ;
		System.out.println(tt);
		
	}
	
}


