package comparatorExample.exampleFour;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.lang.*;

public class MainEmployer {
	
	public static void main(String args[]) {
		
		List<Employer> emp = new ArrayList<Employer>();
		emp.add(new Employer("Srikrishna",151));
		emp.add(new Employer("Srikrishna",121));		
		Collections.sort(emp);
		
		
		
	}

}
