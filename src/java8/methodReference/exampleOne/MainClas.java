package java8.methodReference.exampleOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;




public class MainClas {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		
		Example obj = new Example();   
		// Method reference using the object of the class
		MyInterface ref = obj::myMethod3;  
		// Calling the method of functional interface  
		ref.display(); 
		
		
		Set<String> userNem = new HashSet<String>();
		userNem.add("Krishna");
		userNem.add("Krishna");
		userNem.add("Radha");
		userNem.add("Ram");
		userNem.add("");
		userNem.add("");
		userNem.add(null);
		userNem.add(null);
		
		
		System.out.println("Set " + userNem);
		
		List<String> userNema = new ArrayList<String>();
		userNema.add("Krishna");
		userNema.add("Krishna");
		userNema.add("Radha");
		userNema.add("Ram");
		userNema.add("");
		userNema.add("");
		userNema.add(null);
		userNema.add(null);
		userNem.addAll(userNema);
		
		System.out.println("List" + userNema);
		
		Map<String, Integer> str = new HashMap<String, Integer>();
		str.put("Krishna", 120);
		str.put("Radha", 420);
		str.put("Seetha", 720);
		
		Map<String, Integer> str1 = new HashMap<String, Integer>();
		str.put("Ganesh", 120);
		str.put("Muruga", 420);
		str.put("Iyappa", 720);
		str.putAll(str1);
		
		System.out.println("merge two hashmap" + str );
		
		
		Map<Integer, String> order = new TreeMap<Integer, String>();
		order.put(10, "Krishna");
		order.put(52, "Ram");
		order.put(33, "Parasuram");
		order.put(2, "Vamanar");
		order.put(0, "Vamanar");
		System.out.println("order = : "+order);
		
		
		Set<Integer> orders = new TreeSet<Integer>();
		orders.add(12);
		orders.add(156);
		orders.add(82);
		orders.add(2);		
		System.out.println("orders = : "+orders);
		
		
		Map<String, Integer> str11 = new HashMap<String, Integer>();
		str11.put("Ganesh", 120);
		str11.put("Muruga", 420);
		str11.put("Iyappa", 720);
		str11.put(null, 1720);
		str11.put(null, 8720);
		//str.putAll(str11);
		
		System.out.println("merge two hashmap11" + str11 );

		
		
	}

}
