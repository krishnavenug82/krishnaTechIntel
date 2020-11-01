package passByValueAndReference.exampleThree.loanCentre;

public class MainEmiLoan {

	static Interest emiCalculation = new Interest();

	public static void main(String args[]) {

		Loans loans = new Loans();

		System.out.println(loans.autoLoan(1000,9));

	}

}
