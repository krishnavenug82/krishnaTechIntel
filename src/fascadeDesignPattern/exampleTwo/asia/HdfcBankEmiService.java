package fascadeDesignPattern.exampleTwo.asia;

public class HdfcBankEmiService {
	
	public Double EmiCalculation(int principle, int years) {

		double interest = 0;

		if (principle > 1000000) {

			interest = 11;

			return (principle * years * (interest / 100));

		} else if (principle > 1000001 && principle < 10000000) {

			interest = 10;

			return (principle * years * (interest / 100));
		} else
			interest = 9;

		return (principle * years * (interest / 100));

	}
}
