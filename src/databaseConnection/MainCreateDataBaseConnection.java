package databaseConnection;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MainCreateDataBaseConnection {
	
	public static void main(String args[]) throws ClassNotFoundException, SQLException {
		
		CreateDataBaseConnection createDb = new CreateDataBaseConnection();		
		ResultSet rs = createDb.createDataBase().executeQuery("Select * from Employee");
		createDb.getConn().close();
		
	}

}
