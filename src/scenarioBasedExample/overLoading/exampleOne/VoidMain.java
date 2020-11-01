package scenarioBasedExample.overLoading.exampleOne;

public class VoidMain {
	
	String hhh ;
	
	VoidMain(String str ){
		
		this.hhh = str;
		
	}

	public static void main(String args[]) {
		
			

		Car car = new Car();
		car.run(new Gas());
		car.run(new Diesel());
		car.run(new Petrol());
		car.run(new Karosine());
		car.run(new Diesel(), new Petrol());
		
		
	}

}
