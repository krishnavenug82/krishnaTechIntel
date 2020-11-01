package constructorExample.ConstructorWithThow;

import java.sql.SQLException;

public class MainExampleOne {
	
	public static void main (String args[])  {
		
		try {
			ExampleOne exampleOne = new ExampleOne();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
