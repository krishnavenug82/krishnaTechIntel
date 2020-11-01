package hashMapExample.exampleThree;

import java.util.HashMap;
import java.util.Map;

public class ExampleThree {

	
	public static void main (String args[]) {
		
		
	Map<String ,String> hashm =  new HashMap<String ,String>();
	hashm.put("A", "Krishna");
	hashm.put("B", "Shiva");
	hashm.put("C", "Bharama");
	System.out.println("hashm =    " + hashm.get("A").hashCode());
	System.out.println("hashm =    " + hashm.get("B").hashCode());
	
	
	hashm.put("A", "Muruga");
	System.out.println("hashm =    " + hashm);
	System.out.println("hashm =    " + hashm.get("A").hashCode());
	System.out.println("hashm =    " + hashm.get("B").hashCode()); 
	
	
	}
}
