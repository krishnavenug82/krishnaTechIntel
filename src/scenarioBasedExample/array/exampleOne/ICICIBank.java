package scenarioBasedExample.array.exampleOne;

public class ICICIBank {

	String users;

	public Consumer addCustomer(Consumer userDetails) {

		userDetails.setAge(75);
		userDetails.setEducation("B.Tech");
		userDetails.setLocation("Delhi");
		userDetails.setName("Hanumaan");

		return userDetails;

	}

	public static Consumer addConsumer(Consumer userDetails, String name) {

		userDetails.setAge(75);
		userDetails.setEducation("B.Tech");
		userDetails.setLocation("Delhi");
		userDetails.setName("Hanumaan");

		return userDetails;

	}

}
