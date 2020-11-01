package thread.dataBaseConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DataBaseConnectionEx {
	
	public void CurrentDateTimeExample() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
	}

	public void conumser() {

		try {
			System.out.println("Start");
			CurrentDateTimeExample();
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "parvathi","srikrishnA@8");
			Statement stat = conn.createStatement();
			String consumer = "Select * from EMPLOYEE";
			ResultSet rs = stat.executeQuery(consumer); 
			while (rs.next()) {
				
			System.out.println(rs.getInt("ID") + "; " + rs.getString("NAME") + "; " +rs.getInt("SALARY"));
			
			}
			conn.close();

		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		System.out.println("End");
		CurrentDateTimeExample();
	}

}
