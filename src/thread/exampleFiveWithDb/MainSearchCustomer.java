package thread.exampleFiveWithDb;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import Database.databaseConnection.DatabaseConnection;

public class MainSearchCustomer implements Runnable{

	public void run() {
		// TODO Auto-generated method stub
		openFiles();

	}

	public void openFiles() {

		// CSV file
		File file = new File("H:\\Java_Hadoop\\FileReaderAndWriter\\searchCustomer.csv");
		Scanner sc = null;
		Statement s = new DatabaseConnection().dbprivilage();
		try {

			sc = new Scanner(file);
			// Check if there is another line of input
			while (sc.hasNextLine()) {
				String str = sc.nextLine();
				SearchCustomer searchCustomers = new SearchCustomer();
				// customers.parseLine(str);r
				searchCustomers.parseLine(str, s);
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
