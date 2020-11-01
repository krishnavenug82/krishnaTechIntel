package fascadeDesignPattern.exampleTwo.asia;

public class IciciBankEmiService {

	public Double EmiCalculation(int principle, int years) {

		double interest = 0;

		if (principle > 1000000) {

			interest = 8;

			return (principle * years * (interest / 100));

		} else if (principle > 1000001 && principle < 10000000) {

			interest = 7;

			return (principle * years * (interest / 100));
		} else
			interest = 6;

		return (principle * years * (interest / 100));

	}
}
