package scenarioBasedExample.aircondioner;

public class MainAirController {
	
	public static void main (String args[]) {
		
		AirController runCompressor = new AirController();
		//runCompressor.runCompressor(16, "unit1");
		
		FlameController flameC = new FlameController();
		flameC.runCompressor("unit1", 1);
		
	}

}
