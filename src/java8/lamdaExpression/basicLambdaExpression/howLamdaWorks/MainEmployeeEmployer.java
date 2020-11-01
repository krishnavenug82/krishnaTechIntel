package java8.lamdaExpression.basicLambdaExpression.howLamdaWorks;

public class MainEmployeeEmployer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Employer employerr = new Employer();
		employerr.fundTransfer();
		System.out.println(employerr.interest());
		employerr.swiftTransfer();
		System.out.println(employerr.interfundTransfer());

	}

}
