package hasshmapp;

import java.util.HashMap;

public class Main {

	public static void main(String[] args) {
		
		Employee e1 = new Employee();
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		Employee e4 = new Employee();
		Employee e5 = new Employee();

		HashMap<Employee, String> mp = new HashMap<>();
		
		
		//System.out.println(e1.hashCode() + "\n"+ e2.hashCode() + "\n" + e3.hashCode() + "\n" + e4.hashCode() +"\n" + e5.hashCode());

		mp.put(e1, "krishna1");
		mp.put(e2, "krishna2");
		mp.put(e3, "krishna3");
		mp.put(e4, "krishna4");
		mp.put(e5, "krishna5");

		/*
		 * for (int i = 0; i < 200; i++) { System.out.println(mp.get(e1));
		 * System.out.println(mp.get(e2)); System.out.println(mp.get(e3));
		 * System.out.println(mp.get(e4)); System.out.println(mp.get(e5)); }
		 */

//		System.out.println(mp);
		System.out.println(mp.get(e1));

		/*HashMap<String, String> mp1 = new HashMap<>();
		mp1.put("Name", "Krishna");
		mp1.put("Location", "Chennai");
		mp1.put("City", "Tamilnadu");
		
		System.out.println(mp1);
		System.out.println(mp1.get("City"));*/

	}

}
