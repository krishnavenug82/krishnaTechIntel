package collectionExample.SetExample;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

 public static void main (String args[]) {
	 
	 //Set<String> set =  new LinkedHashSet<String>();
	 Set<String> set =  new HashSet<String>();
	// Set<String> set =  new TreeSet<String>();
	 
	 set.add("Shiva");
	 set.add("Shiva");
	 set.add("bala"); 
	 set.add("Krishna");
	 set.add("Krishna");
	 set.add(null);
	 set.add(null);
	 System.out.println("Add "+set);
	 
	  
	 	 
	
	 set.remove("Shiva");		
	 System.out.println("Remove "+set);	 
	 
	 
	 set.add(null); 
	 set.add(null);
	 System.out.println("Null "+set);
	 
	 set.retainAll(set);
	 System.out.println("retainAll  "+set);
	 
	 set.clear();
	 System.out.println("clear "+set);
	 
	 
	 
	 
	 }
}
