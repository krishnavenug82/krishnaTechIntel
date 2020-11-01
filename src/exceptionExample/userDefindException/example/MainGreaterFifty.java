package exceptionExample.userDefindException.example;

public class MainGreaterFifty {

	static int a = 25;
	static int b;

	public static void emi() throws GreaterFiftyFieldsRunException {

		if (a > 15) {

			throw new GreaterFiftyFieldsRunException("zxzx");
		}

	}

	public static void main(String args[]) {

		try {
			emi();

		} catch (GreaterFiftyFieldsRunException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();
			a = a + 10000;
			try {
				emi();
			} catch (GreaterFiftyFieldsRunException e1) {

			}
		}

	}

}
