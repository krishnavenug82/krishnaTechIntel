package singleTonExample.exampleOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MainExampleOne {
	
	public static void main (String args[]) {
		
		ExampleOne.variableOne.getInstance().customer();
		
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("As", "Krishna");
		map.put("Bs", "Krishna");
		
		System.out.println(map);
		
		List<String> lst = new ArrayList<String>();
		lst.add(null);
		lst.add(null);
		lst.add(null);
		System.out.println(lst);
		
		Set<String> set = new HashSet<String>(lst);
		System.out.println(set);
		
		
		
		
		
		
		
		
	}

}
