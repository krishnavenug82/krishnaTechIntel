package constructorExample.ConstructorWithThow;

import java.sql.SQLException;

public class ExampleOne {
	
	
	ExampleOne () throws SQLException{
		
		System.out.println("India");
		throw new SQLException();
	}

}
