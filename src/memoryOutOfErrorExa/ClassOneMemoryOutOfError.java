package memoryOutOfErrorExa;

import collection.MapClass;

public class ClassOneMemoryOutOfError {
	
	public Integer mulTwonumber(int a,int b) {
		
		int c = 0;
		MapClass mapCls ;
		try {
		 mapCls = 	(MapClass) Class.forName("collection.jhjhjhj").newInstance();
		EmployeeThread jj = new EmployeeThread();
		
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return c = a*b;
	}

}
