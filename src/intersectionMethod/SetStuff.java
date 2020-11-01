package intersectionMethod;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class SetStuff {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s1 = new HashSet();
	    s1.add("Ian Darwin");
	    s1.add("Bill Dooley");
	    s1.add("Jesse James");

	    Set s2 = new HashSet();
	    s2.add("Ian Darwin");
	    s2.add("Doolin' Dalton");

	    Set union = new TreeSet(s1);
	    union.addAll(s2);    // now contains the union
	    

	    System.out.println("union" +  union);

	    Set intersect = new TreeSet(s1); 
	    intersect.retainAll(s2);

	    System.out.println("intersection" +  intersect);

	  }
	
	Map<Integer, String> maa = new HashMap <Integer, String>();
	

	}


