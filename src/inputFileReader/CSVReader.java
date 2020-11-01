package inputFileReader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CSVReader {

		static String[] country = new String[] {};

	public static String[] countryCode() {

		String csvFile = "H:\\Java_Hadoop\\FileReaderAndWriter\\country.csv";
		String line = "";
		String cvsSplitBy = ",";

		try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {

			while ((line = br.readLine()) != null) {
				;

				// use comma as separator
				country = line.split(cvsSplitBy);	
				
				int sizeOfCountry  = country.length;
				
				for(int i = 0 ; i< sizeOfCountry; i++) {
					
					//System.out.println(country[i]);
				}
				
				
				//System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		return country;
	}

	public static void databaseConnection() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "parvathi", "srikrishnA@8");
			con.setAutoCommit(false);
			Statement stmt = con.createStatement();
			
			String [] countryDtl =  countryCode();
			
			int sizeOfCountryDtl = countryDtl.length;
			
			for(int i = 0 ; i < sizeOfCountryDtl ; i++) {
				System.out.println(countryDtl[i]); 
			}
			/*
			 * String query = "" ; stmt.executeQuery(query);
			 */

		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

	}

	public static void main(String args[]) {

		databaseConnection() ;
	}

}
