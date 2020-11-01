package returnChildClass;

public class MainReturnChildClass {

	public static Commercial city() {

		return new Consumer();
	}

	public static Consumer country() {

		return (Consumer) new Commercial();
	}

	public static void main(String args[]) {
		city();
		// country();
	}

}
