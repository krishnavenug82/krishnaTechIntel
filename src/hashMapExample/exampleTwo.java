package hashMapExample;

import java.util.HashMap;
import java.util.HashSet;


public class exampleTwo {
	
	public static void has() {
		
	}
	public static void main (String args[]) {
		HashMap<String, Integer> hash = new HashMap<String , Integer>();
		 hash.put("Doller", 0);
		 hash.put("INR", 100);
		 int  hdhds  = hash.put("Doller", 3000);
		 System.out.println("Return values " + hdhds);
		 int  hdhds1 = hash.put("Doller", 8000);
		 System.out.println( "Total Values " + hash);		 
		 System.out.println("Return values1 " + hdhds1);
		 
		 
		 HashSet<String> set = new HashSet<String>();
		 set.add("Krishna");
		 set.add("Shiva");
		 set.add("Krishna");
		 
		 Boolean res  = set.add(new String());		 
		 System.out.println(res);
		 
		 
		
		 
	}

}
