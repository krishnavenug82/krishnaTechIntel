package scenarioBasedExample.overRiddingExample.exampleTwo;

import scenarioBasedExample.overLoading.exampleOne.Car;

public class VoidMain {

	public static void main(String args[]) {
		
		Petrol pet = new Diesel();
		Diesel die = (Diesel) pet;
		die.run();		
		
		Gas gs = new Petrol();		
		Petrol petrol = (Petrol) gs;
		petrol.run();
		
		Karosine kar = new Gas();		
		Gas gas = (Gas) kar;
		gas.run();
		
		Karosine karosine = new Karosine();
		karosine.run(); 
		
		

	}

}
