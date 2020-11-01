package iteratorExample.exampleOne;

import java.util.Iterator;

public class MainClassOne {

	public static void main(String args[]) {

		ClassOne classOne = new ClassOne();

		Iterator it = classOne.addCustomer().iterator();
		while (it.hasNext()) {
			String obj = (String) it.next();
			System.out.println(obj);
		}

		Iterator it1 = classOne.addConsumer().iterator();
		while (it1.hasNext()) {
			String obj = (String) it1.next();
			System.out.println(obj);
		}

	}

}
