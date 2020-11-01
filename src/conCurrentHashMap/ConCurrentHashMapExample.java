package conCurrentHashMap;

import java.util.regex.*;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;

public class ConCurrentHashMapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> conMap = new ConcurrentHashMap<Integer, String>();
		conMap.put(1, "Krishna");
		conMap.put(10, "Krishna");
		conMap.put(5, "Krishna");
		conMap.put(4, "Krishna");
		System.out.println("ConcurrentHashMap = " + conMap);

		Map<Integer, String> conMap1 = new HashMap<Integer, String>();
		conMap1.put(1, "Krishna");
		conMap1.put(10, "Krishna");
		conMap1.put(5, "Krishna");
		conMap1.put(4, "Krishna");
		System.out.println("HashMap = " + conMap1);

		Map<Integer, String> conMap2 = new LinkedHashMap<Integer, String>();
		conMap2.put(1, "Krishna");
		conMap2.put(10, "Krishna");
		conMap2.put(5, "Krishna");
		conMap2.put(4, "Krishna");
		System.out.println("LinkedHashMap = " + conMap2);

		Map<Integer, String> conMap3 = new Hashtable<Integer, String>();
		conMap3.put(0, "Krishna");
		conMap3.put(10, "Krishna");
		conMap3.put(5, "Krishna");
		conMap3.put(4, "Krishna");
		System.out.println("Hashtable = " + conMap3);

		System.out.println(Collections.synchronizedMap(conMap2));

		Set<Integer> sett = new HashSet<Integer>();
		sett.add(6);
		sett.add(0);
		sett.add(0);
		sett.add(26);
		sett.add(2);
		System.out.println("sett  = " + sett);
		
		Set<String> settr = new HashSet<String>();
		settr.add("");
		settr.add("Madhu");
		System.out.println( "Final" + settr);

		Set<Integer> sett2 = new TreeSet<Integer>(sett);
		System.out.println(" Treedset = " + sett2);

		Set<Integer> sett1 = new LinkedHashSet<Integer>();
		sett1.add(6);
		sett1.add(1);
		sett1.add(26);
		sett1.add(2);
		sett1.add(2);

		System.out.println("LinkedHashSet  = " + sett1);
	}

}
