package factoryDesignPattern.realTimeExample;

public class MainForRealTimeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String typeNameBox = "S";

		switch (typeNameBox) {
		case "Suv":

			SuvCar suvCar = new SuvCar();
			suvCar.measurement(15, 20, 88, 5, 5);
			break;
		case "Sedan":	
			
			
		}

	}

}
