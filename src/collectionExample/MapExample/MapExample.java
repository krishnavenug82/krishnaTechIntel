package collectionExample.MapExample;

import java.util.Collections;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapExample {

 public static void main (String args[]) {
	 
	 //Map<Integer, String> map  =  new HashMap<Integer, String>();
	 //Map<Integer, String> map  =  new LinkedHashMap<Integer, String>();
	 //Map<Integer, String> map  =  new Hashtable<Integer, String>();
	 Map<Integer, String> map  =  new TreeMap<Integer, String>();
	 
	 //Map<String, String> map11  =  new HashMap<String, String>();
	 Map<String, String> map11  =  new LinkedHashMap<String, String>();
	 //Map<String, String> map11  =  new Hashtable<String, String>();
	 map11.put("Krishna", "Radha");
	 map11.put("Athi", "World");	 
	 map11.put("Krishna", "Radha");
	 map11.put(null, "Radha");
	 map11.put(null, "Radha");
	 System.out.println("Find " + map11);	 
	 
	 
	 Map<Integer, String> map2 =  new HashMap<Integer, String>();
	 
	 map.put(100, "Krishna");
	 map.put(0, "Krishna");
	 map.put(200, "Shiva");
	 map.put(101, "Krishna");
	 map.put(201, "Shiva");
	 System.out.println("Find " + map);
	 System.out.println("Add " + map.get(101));
	 
	 map2.put(654, "Hanumaan");
	 map2.putAll(map);
	 
	 System.out.println( "putAll" + map2);	 
	 
	 map.remove(101);	 
	 System.out.println("Remove " + map);	 
	 
	 map.replace(100, "Krishna Venu g ");
	 System.out.println("Replace " + map.get(100));	
	 
	 map.putIfAbsent(25, "Iyappa");
	 System.out.println("putIfAbsent" + map);	
	 
	 map.clear();
	 System.out.println("clear"+ map);	  
	 
	 
	 Map<String, String> map1 =  new HashMap<String, String>();
	 map1.put(null, null);
	 map1.put(null, "");
	 map1.put("", "Krishna");	 
	 System.out.println("Null " + map1); 
	 
	 
	 Map<String, String> map3 =  new HashMap<String, String>();
	 map3.put("A", "Krishna");
	 System.out.println("Map3 " + map3);
	 
	 map3.replace("A", "Muruga");
	 System.out.println("Map3 " + map3.get("A"));
	 
		 
	 }
}
