package fascadeDesignPattern.exampleTwo.Australia;

public class ZOB {

	public Double EmiCalculation(int principle, int years) {

		double interest = 0;

		if (principle > 1000000) {

			interest = 5;

			return (principle * years * (interest / 100));

		} else if (principle > 1000001 && principle < 10000000) {

			interest = 4;

			return (principle * years * (interest / 100));
		} else
			interest = 3;

		return (principle * years * (interest / 100));

	}
}
