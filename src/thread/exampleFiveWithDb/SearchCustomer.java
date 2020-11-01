package thread.exampleFiveWithDb;

import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class SearchCustomer {
	
	public void  parseLine(String str, Statement s) {
		String UserName, passWord, active;
		Scanner sc = new Scanner(str);
		sc.useDelimiter(",");
		
		// Check if there is another line of input
		while (sc.hasNext()) {
			UserName = sc.next();
			passWord = sc.next();
			active = sc.next();

			//DatabaseConnection Database = new DatabaseConnection();
			String addUser = "select * from threastesting where " + " USERNAME ="+ "'" + UserName
					+ "'" + "and "  + "PASSWORD = " + "'" + passWord + "'" ;
			try {
				//Database.dbprivilage().executeQuery(addUser);
				s.executeQuery(addUser);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.println("USERNAME - " + UserName + " PASSWORD - " + passWord + " ACTIVE - " + active);
		}
		sc.close();
		 
	}


}
