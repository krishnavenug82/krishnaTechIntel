package scenarioBasedExample.castingExample.interfaceExample;

public class VoidMainClassEx {
	
	public static void main (String args[]) {
		
		Fuel die = new Diesel();
		Fuel pet = new Petrol();
		Fuel gas = new Gas();
		Fuel kero = new Kerosine();
		
		
		Car car = new Car();
		car.run(die);
		car.run(pet);
		car.run(gas);
		car.run(kero);
		
	}

}
