package scenarioBasedExample.aircondioner;

public class AirController {

	public int setMoistorise(int atucalTemp, String tempMetrics) {

		if (tempMetrics.equals("Centigrade")) {

			return ((atucalTemp * 9 / 5) + 32);

		} else if (tempMetrics.equals("Forenhehit")) {

			return ((atucalTemp - 32) * 5 / 9);

		} else if (tempMetrics.equals("unit1")) {

			return ((atucalTemp + 32) * 5 / 9);

		} else if (tempMetrics.equals("unit2")) {

			return ((atucalTemp / 32) * 5 / 9);

		}
		return 0;

	}

	public void runCompressor(int actualTemp, String tempMetrics) {

		int moistoriseUnit = setMoistorise(actualTemp, tempMetrics);
		if (moistoriseUnit >  15 && moistoriseUnit < 33) {

			System.out.println("The compressor is ready on ");
		} else {
			System.out.println("Enter required tempature");
		}
	}
 
	 
	
}
