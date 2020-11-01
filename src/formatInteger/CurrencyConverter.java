package formatInteger;

import java.text.DecimalFormat;
import java.util.Locale;

public class CurrencyConverter {

	public double usaCurrency(int conversionRate, double conversionAmount) {
		return conversionRate * conversionAmount;
	}

	public void finalAmount() {

		double result = usaCurrency(52, 5.2);
		
		Double test = 1544.30;
		String text = String.format("%.06f", test);
		System.out.println(text);
		
	
	}
}
