package java8.lamdaExpression.exampleOne.oneparameter;

public class ExampleOne {

	private static String userName;

	public static void main(String args[]) {

		Consumer cons1 = (name, age, city, loc) -> {

			if (age > 12) {
				
				age = age *10 ;

			}

			userName = name + "   : " + "Sriradhakrishna" + ":  " + age + " " + city + "  " + loc;

			return userName;

		};

		System.out.println(cons1.consumer("Krishna", 50, "VK", "PK"));

		// Anonymous class
		Consumer cons = new Consumer() {

			@Override
			public String consumer(String name, int age, String city, String location) {
				// TODO Auto-generated method stub
				return null;
			}

		};

	}

}
