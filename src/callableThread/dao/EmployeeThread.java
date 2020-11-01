package callableThread.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

public class EmployeeThread implements Callable<List<EmployeePersonlDetails>> {

	Connection connectDb;
	Statement statement;
	ResultSet retrieveDataFrmDb;
	int threadBeginwith;
	int threadEndwith;
	List<EmployeePersonlDetails> employeeList = new ArrayList<EmployeePersonlDetails>();

	public EmployeeThread(int beginwith, int endwith) {
		this.threadBeginwith = beginwith;
		this.threadEndwith = endwith;

	}

	@Override
	public List<EmployeePersonlDetails> call() throws Exception {

		Class.forName("oracle.jdbc.driver.OracleDriver");
		connectDb = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "parvathi", "srikrishnA@8");
		statement = connectDb.createStatement();
		String sql = "Select * from Consumers where id between " + threadBeginwith + " and " + threadEndwith;
		retrieveDataFrmDb = statement.executeQuery(sql);
		// Consumers cons = new Consumers();

		while (retrieveDataFrmDb.next()) {
			EmployeePersonlDetails employeeLstFrmTbl = new EmployeePersonlDetails();
			employeeLstFrmTbl.setId(retrieveDataFrmDb.getInt("ID"));
			employeeLstFrmTbl.setName(retrieveDataFrmDb.getString("NAME"));
			employeeLstFrmTbl.setDept(retrieveDataFrmDb.getString("DEPT"));
			employeeLstFrmTbl.setLocation(retrieveDataFrmDb.getString("LOCATION"));
			employeeLstFrmTbl.setDesig(retrieveDataFrmDb.getString("DESIGNATION"));
			employeeLstFrmTbl.setEmail(retrieveDataFrmDb.getString("EAMIL"));

			/*
			 * System.out.println("Id =" + rs.getInt(1) +"Name ="+ rs.getString(2)+
			 * "Dept ="+rs.getString(3)+"Location ="
			 * +rs.getString(4)+"Designation ="+rs.getString(5)+"Email = "+rs.getString(6));
			 */

			employeeList.add(employeeLstFrmTbl);

		}

		return employeeList;

	}

}
