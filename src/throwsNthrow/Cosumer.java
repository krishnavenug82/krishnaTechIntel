package throwsNthrow;

import java.sql.SQLException;

public class Cosumer {

	void calc(int a, int b) throws SQLException {

		int c = a / b;
		
		if(c > 100) {

		throw new SQLException();
		}
		System.out.println("Sucessfully Transfered ");
	}

}
