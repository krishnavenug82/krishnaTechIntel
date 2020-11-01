package scenarioBasedExample.overLoading.exampleOne;

public class Car {

	public void run(Diesel die) {

		System.out.println("Run by Diesel");
	}

	public void run(Petrol pet) {

		System.out.println("Run by Petrol");
	}

	public void run(Gas gas) {

		System.out.println("Run by Gas");
	}
	
	public void run(Karosine karosine) {
		
		System.out.println("Run by Gas");
	}
	
	public void run(Diesel Diesel , Petrol petrol) {
		
		System.out.println("Run by Diesel & Petrol");
	}

}
