package publicPrivate;

import java.util.HashSet;

public class Employee {

	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() > 100) {
			this.name = name;
		}

	}
	
	public void consumer() {
		HashSet<String> cons = new HashSet<String>();
		cons.
	}

}
