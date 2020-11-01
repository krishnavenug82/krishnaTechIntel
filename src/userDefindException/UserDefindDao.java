package userDefindException;

public class UserDefindDao {

	public Boolean userCredential(Object obk) throws UserDefindException {
		int i = 0;
		if (i != 0 ) {
			throw new UserDefindException("user name not presence");
		}

		else if (i == 25) {
			throw new UserDefindException("not abl");
		}

		else if (i > 500) {
			throw new UserDefindException("user name not Macthed ");
		}

		else
			throw new UserDefindException("Failed Logging");

	}
}
