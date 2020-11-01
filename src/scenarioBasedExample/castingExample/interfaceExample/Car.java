package scenarioBasedExample.castingExample.interfaceExample;

public class Car {
	
	void run (Fuel fuelOfCar) {
		
		fuelOfCar.run();
		System.out.println(fuelOfCar.octaneNumber());
	}

}
