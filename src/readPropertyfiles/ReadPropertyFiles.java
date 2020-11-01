package readPropertyfiles;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertyFiles {
	
	
   public static  int addTwoNumber(int a , int b) {
	   
	   return a+b;
   }

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileReader reader = new FileReader("config.properties"); // Read
		Properties p = new Properties(); // Class
		p.load(reader);
		System.out.println(p.getProperty("db.user"));
		System.out.println(p.getProperty("db.password"));
		System.out.println(p.getProperty("db.url"));
		 
		addTwoNumber (10,66);

	}

}
