package iteratorExample.exampleTwo;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Consumer consumer = new Consumer();
		List<String> xx = consumer.clients();
		Iterator ite = xx.iterator();
		while (ite.hasNext()) {
			System.out.println("Next element: " + ite.next());
		}

		ListIterator lstIte = xx.listIterator();
		while (lstIte.hasNext()) {
			System.out.println(lstIte.next());
		}

		while (lstIte.hasPrevious()) {
			System.out.println(lstIte.previous());
		}
	}

}
