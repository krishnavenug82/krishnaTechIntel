package overRiding.overRidingConcepts;

import java.io.IOException;
import java.sql.SQLException;

public class ClassaC extends ClassD {

	public String consumer(String name) {

		return name;
	}

	public String commercial(String name) {

		return name;
	}

	public   String clientFin(String name) {
		System.out.println(name);

		return name;
	}

	public Double usersDiff(String name) {
		System.out.println(name);

		return null;
	}

	public static String clientStatic(String name) {

		return name;
	}

	private String clientPrivate(String name) {

		return name;
	}

	public String clientExcep(String name) throws Exception {

		return name;
	}

}
