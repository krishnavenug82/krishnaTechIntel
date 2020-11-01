package scenarioBasedExample.aircondioner;

public class FlameController1 {

	public int flametemparature(String tempMetrics, int colorCode) {

		String color = color(colorCode);

		if ((color.equals("Yellow")) && (tempMetrics.equals("centigrade"))) {

			return 50;
		}

		if ((color.equals("Yellow")) && (tempMetrics.equals("farenhited"))) {

			return 51;
		}

		if ((color.equals("Yellow")) && (tempMetrics.equals("unit1"))) {

			return 52;
		}

		if ((color.equals("Yellow")) && (tempMetrics.equals("unit2"))) {

			return 53;
		}

		if ((color.equals("Red")) && (tempMetrics.equals("centigrade"))) {

			return 60;
		}

		if ((color.equals("Red")) && (tempMetrics.equals("farenhited"))) {

			return 61;
		}

		if ((color.equals("Red")) && (tempMetrics.equals("unit1"))) {

			return 62;
		}

		if ((color.equals("Red")) && (tempMetrics.equals("unit2"))) {

			return 63;
		}

		if ((color.equals("Blue")) && (tempMetrics.equals("centigrade"))) {

			return 70;
		}

		if ((color.equals("Blue")) && (tempMetrics.equals("farenhited"))) {

			return 71;
		}

		if ((color.equals("Blue")) && (tempMetrics.equals("unit1"))) {

			return 72;
		}

		if ((color.equals("Blue")) && (tempMetrics.equals("unit2"))) {

			return 73;
		}

		if ((color.equals("Ash")) && (tempMetrics.equals("centigrade"))) {

			return 80;
		}

		if ((color.equals("Ash")) && (tempMetrics.equals("farenhited"))) {

			return 81;
		}

		if ((color.equals("Ash")) && (tempMetrics.equals("unit1"))) {

			return 82;
		}

		if ((color.equals("Ash")) && (tempMetrics.equals("unit2"))) {

			return 83;

		} else {

			return 0;
		}

	}

	public String color(int colorCode) {

		switch (colorCode) {
		case 1:
			return "Yellow";
		case 2:
			return "Red";
		case 3:
			return "Blue";
		case 4:
			return "Ash";
		default:
			return "Dark";
		}

	}

	public void runCompressor(String tempMetrics, int color) {

		int unitOfFlame = flametemparature(tempMetrics, color);

		if (unitOfFlame > 15 && unitOfFlame < 33) {

			System.out.println("The compressor is ready on ");
		} else {
			System.out.println("Enter required tempature");
		}

	}

}
