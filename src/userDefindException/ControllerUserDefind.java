package userDefindException;

public class ControllerUserDefind {

	public String loginCredential() {

		UserDefindDao userDefindImple = new UserDefindDao();
		try {
			boolean loginStatus = userDefindImple.userCredential(new Object());
			if (loginStatus == true) {

				return "SuccessFully logged ";
			}

		} catch (UserDefindException e) {
			// TODO Auto-generated catch block
			// e.printStackTrace();

			return e.getMessage();
		}
		return "Failed to Logging";

	}

}
