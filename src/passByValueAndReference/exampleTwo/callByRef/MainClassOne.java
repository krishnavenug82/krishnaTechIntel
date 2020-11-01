package passByValueAndReference.exampleTwo.callByRef;

public class MainClassOne {

	static int consumer(ClassOne clsOne) {
		int fundAmount = clsOne.xx = 500;
		
		ClassTwo classTwo = new ClassTwo();
		System.out.println("Class Two in "+ classTwo.commercialLoanInterest());
		return fundAmount;

	}

	public static void main(String args[]) {

		ClassOne classOne = new ClassOne();
		System.out.println("Before " + classOne.xx);

		consumer(classOne);
		System.out.println("After " + classOne.xx);

		ClassTwo classTwo = new ClassTwo();
		int approvedInterestAmt = classTwo.commercialLoanInterest();
		System.out.println("Class Two value " + approvedInterestAmt);
	}

}
