package exceptionExample.userDefindException;

import exceptionExample.throwExample.Loan;

public class MainUserDefindException {

	public static void main(String args[]) {

		UserDefindExceptionTwo userDefindExceptionTwo = new UserDefindExceptionTwo();
		try {
			userDefindExceptionTwo.productCheck(50);
		} catch (UserDefindExceptionOne e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		

	}
}
