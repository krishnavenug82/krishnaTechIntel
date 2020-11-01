package thread.exampleFiveWithDb;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import Database.databaseConnection.DatabaseConnection;

public class MainAddCustomer implements Runnable {
	
	int j;
	
	MainAddCustomer(int i ){
		
		this.j = i;
		
	}

	public void run() {
		// TODO Auto-generated method stub
		openFiles();

	}

	public void openFiles() {

		// CSV file
		File file = new File("H:\\Java_Hadoop\\FileReaderAndWriter\\customer.csv");
		Scanner sc = null;
		Statement s = new DatabaseConnection().dbprivilage();
		try {

			sc = new Scanner(file);
			// Check if there is another line of input
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				AddCustomers addCustomers = new AddCustomers(j); 
				// customers.parseLine(str);r
				addCustomers.parseLine(str, s);
			}

		} catch (IOException exp) {
			// TODO Auto-generated catch block
			exp.printStackTrace();
		} finally {
			try {
				s.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		sc.close();
	}

}
