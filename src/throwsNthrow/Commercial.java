package throwsNthrow;

import java.io.IOException;
import java.sql.SQLException;

public class Commercial {
	
	public void address () throws SQLException{
		
		throw new SQLException();
	}
	
	public void age() throws IOException {
		
		throw new IOException();
	}

	public void street() throws Exception {
		
		throw new Exception();
	}
	
	public void city() {
		
	}
}

