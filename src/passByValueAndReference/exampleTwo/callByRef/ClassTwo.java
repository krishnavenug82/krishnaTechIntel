package passByValueAndReference.exampleTwo.callByRef;

public class ClassTwo {

	int commercialLoanInterest() {

		ClassOne classOne = new ClassOne();
		int commercialInterestWithoutDedection = classOne.xx;
		return commercialInterestWithoutDedection;
	}

}
