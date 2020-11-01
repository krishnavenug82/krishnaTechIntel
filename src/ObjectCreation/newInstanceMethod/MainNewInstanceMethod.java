package ObjectCreation.newInstanceMethod;

public class MainNewInstanceMethod {
	
	

	String name = "Srikrishna";

	public static void main(String args[])
			throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		// MainNewInstanceMethod NewInstanceMethod =
		// MainNewInstanceMethod.class.newInstance();

		Class cls = Class.forName("MainNewInstanceMethod");

		MainNewInstanceMethod obj = (MainNewInstanceMethod) cls.newInstance();

		System.out.println(obj.name);

	}
}
