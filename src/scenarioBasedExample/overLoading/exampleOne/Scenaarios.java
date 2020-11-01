package scenarioBasedExample.overLoading.exampleOne;

public class Scenaarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c = new Car();
		Gas gas=new Gas();
		c.run(gas);
		
		Diesel diesel= new Diesel();
		c.run(diesel);		
	}

}
