package comparableExample.exampleOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MyComparable {

	public static void main(String args[]) {

		List<Employee> empl = new ArrayList<Employee>();
		empl.add(new Employee(1200, "Krishna", 12));
		empl.add(new Employee(2000, "Linga", 42));
		empl.add(new Employee(1200, "Bharama", 32));

		List<String> bb = new ArrayList<String>();

		bb.add("Rs");
		bb.add("Xs");
		bb.add("ms");

		Collections.sort(empl);

		for (Employee ite : empl) {
			System.out.println(ite.age);
		}

		Collections.sort(bb);
		System.out.println(bb);

		List<Integer> cc = new ArrayList<Integer>();

		cc.add(12);
		cc.add(58);
		cc.add(8);
		Collections.sort(cc);
		System.out.println("cc" + cc);

	}

}
