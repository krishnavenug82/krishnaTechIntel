package scenarioBasedExample.castingExample.castingExampleOne;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Car v=new Car();   ** Expected scnarios
		v.run(new Diesel());
		v.run(new Pertol());*/
		
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
