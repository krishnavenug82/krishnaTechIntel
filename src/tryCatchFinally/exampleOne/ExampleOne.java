package tryCatchFinally.exampleOne;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class ExampleOne {

	public void addCustomer() {
		
		Connection conn = null;
		Statement  stat = null;
		try {
			//conn.prepareStatement("dfdf");
			
			
		} finally {
			
			System.out.println("Finally ");
		
		}

	}

}