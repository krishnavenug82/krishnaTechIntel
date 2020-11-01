package iteratorExample.exampleOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class ClassOne {

	public ArrayList<String> addCustomer() {

		ArrayList<String> customer = new ArrayList<String>();
		customer.add("Krishna");
		customer.add("Vishnu");
		customer.add("Bharma");

		return customer;

	}

	public Set<String> addConsumer() {
		Set<String> consumer = new HashSet<String>();
		consumer.add("Tulasi");
		consumer.add("Villva");
		consumer.add("Arugam ");

		return consumer;

	}

}
