package scenarioBasedExample.overRiddingExample.exampleOne;

public class VoidMain {

	public static void main(String args[]) {
		
			 
		Car diesel = new Diesel();
		diesel.run(); 
		
		Car petrol = new Petrol();
		petrol.run();
		
		Car gas = new Gas();
		gas.run();
		 
		Car karosine = new Karosine();
		karosine.run();
		
		

	}

}
