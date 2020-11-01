package hashMapExample.collisionExampl;

import java.util.HashMap;
import java.util.Map;

public class CollisionExam {
	
	
	public static void main(String args[]) {
		
		Map<Integer, String> consumer = new HashMap<Integer, String>();
		consumer.put(1,"Tcs");
		consumer.put(2,"wipro");
		consumer.put(1,"Srimadhavan");
		
		System.out.println(consumer);
	}

}
