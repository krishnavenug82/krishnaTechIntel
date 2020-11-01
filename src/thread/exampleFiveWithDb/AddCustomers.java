package thread.exampleFiveWithDb;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import org.apache.log4j.Logger;


public class AddCustomers {

	final static Logger logger = Logger.getLogger(AddCustomers.class);

	int k;

	AddCustomers(int i) {

		this.k = i;

	}

	public void parseLine(String str, Statement s) {

		
		String UserName, passWord, active;
		Scanner sc = new Scanner(str);
		sc.useDelimiter(",");

		// Check if there is another line of input
		while (sc.hasNext()) {
			UserName = sc.next();
			passWord = sc.next();
			active = sc.next();

			// DatabaseConnection Database = new DatabaseConnection();
			String addUser = "insert into threastesting(USERNAME,PASSWORD,ACTIVE,THREADITERATIONID)" + " values ( "
					+ "'" + UserName + "'" + "," + "'" + passWord + "'" + "," + "'" + active + "'" + "," + k + " )";
			try {
				// Database.dbprivilage().executeQuery(addUser);
				s.executeQuery(addUser);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
						
			logger.info("Thread Name = "+ k +" USERNAME - " + UserName + " PASSWORD - " + passWord + " ACTIVE - " + active);
			// System.out.println("USERNAME - " + UserName + " PASSWORD - " + passWord + "
			// ACTIVE - " + active);
			
			/*logger.trace("Trace");
			logger.debug("Debug");
			logger.info("Info");
			logger.warn("Warn");
			logger.error("Error");
			logger.fatal("Fatal");*/
		}
		sc.close();

	}

}
