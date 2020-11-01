package callableStatement.InOutStatement;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCExample {

	// JDBC driver name and database URL
	   static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	   static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:xe";

	   //  Database credentials
	   static final String USER = "parvathi";
	   static final String PASS = "srikrishnA@8";
	   
	   public static void main(String[] args) {
	   Connection conn = null;
	   CallableStatement callstmt = null;
	   try{
	      //STEP 2: Register JDBC driver
	      Class.forName("oracle.jdbc.driver.OracleDriver");

	      //STEP 3: Open a connection
	      System.out.println("Connecting to database...");
	      conn = DriverManager.getConnection(DB_URL,USER,PASS);

	      //STEP 4: Execute a query
	      System.out.println("Creating statement...");
	      String sql = "{call getEmpName (?)}";
	      callstmt = conn.prepareCall(sql);
	      
	      //Bind IN parameter first, then bind OUT parameter
	      
	      int empid = 2001;
	      callstmt.setInt(1, empid);
	      
	      // Because second parameter is OUT so register it
	      callstmt.registerOutParameter(1,java.sql.Types.NUMERIC); 
	     	      
	      //Use execute method to run stored procedure.
	      System.out.println("Executing stored procedure..." );
	      callstmt.execute();

	      //Retrieve employee name with getXXX method
	     int employeeId = callstmt.getInt(1);
	      System.out.println("Emp Name with ID:" + employeeId);
	      callstmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(callstmt!=null)
	            callstmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   System.out.println("Goodbye!");
	}//end main
}
