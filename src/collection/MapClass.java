package collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClass {
	
	public static void main(String args[]) {
		
		Map<Integer, String> hashmap = new HashMap<Integer, String>();
		hashmap.put(100, "Srikrishna");
		hashmap.put(200, "");
		hashmap.put(300, null);
		hashmap.put(400, "Srikrishna");
		hashmap.put(500, null);
		hashmap.put(300, "Bharama");
		hashmap.put(0, null);
		System.out.println("hashmap = " + hashmap);		
		
		
		Map<Integer, String> lnkhasmap = new LinkedHashMap<Integer, String>();
		lnkhasmap.put(100, "Srikrishna");		
		lnkhasmap.put(400, "Srikrishna");
		lnkhasmap.put(500, null);
		lnkhasmap.put(300, "Bharama");
		lnkhasmap.put(0, null);
		lnkhasmap.put(200, "");
		lnkhasmap.put(300, null);
		System.out.println("lnkhasmap = " + lnkhasmap);		
		
			
		Map<String, String> treemap = new TreeMap<String, String>();
		treemap.put("", "");
		//treemap.put(null, "Krishna");
		treemap.put("Krishna", "Bharama"); 
		treemap.put("Krishna", "Shiva");
		//treemap.put(null, "SriKrishna");
		treemap.put("one", "Krishna");
		System.out.println("treemap =  " + treemap);
		
		Map<Integer, String> hashtbl = new Hashtable<Integer, String>();
		hashtbl.put(100, "Srikrishna");
		hashtbl.put(200, "");
		//hashtbl.put(300, null);
		hashtbl.put(400, "Srikrishna");
		//hashtbl.put(500, null);
		hashtbl.put(300, "Bharama");
		//hashtbl.put(0, null);
		System.out.println("Hashtable = " + hashtbl);	
		
		
		
		
		
	}

}
