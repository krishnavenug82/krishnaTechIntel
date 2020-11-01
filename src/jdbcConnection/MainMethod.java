package jdbcConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class MainMethod {

	public static final Logger logger = Logger.getLogger(MainMethod.class);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		Class.forName("org.springframework.jdbc.datasource.DriverManagerDataSource");
		Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "parvathi",
				"srikrishnA@8");
		Statement stat = conn.createStatement();
		String query = "Select * from ApplicationForm";
		ResultSet rs = stat.executeQuery(query);
		while (rs.next()) {
			rs.getString("STUDENTID");
			rs.getString("USERNAME");
			rs.getString("PASSWORD");
			logger.info(rs.getString("STUDENTID") + "" + rs.getString("USERNAME") + "" + rs.getString("PASSWORD"));
			System.out.println(rs.getString("STUDENTID") + "/" + rs.getString("USERNAME") + "/" + rs.getString("PASSWORD"));

		}
	}

}
