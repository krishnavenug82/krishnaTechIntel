package overRiding.overRidingConcepts;

import java.sql.SQLException;

public class ClassD {

	public String consumer(String name) {

		return name;
	}

	private String commercial(String name) {

		return name;
	}

	public final String clientFin(String name) {

		return name;
	}

	public String usersDiff(String name) {

		return null;
	}

	public  String clientStatic(String name) {

		return name;
	}

	public String clientPrivate(String name) {

		return name;
	}
	
	public String clientExcep(String name) throws SQLException {

		return name;
	}
}
