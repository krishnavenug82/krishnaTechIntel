package onlineTestExample.testOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StringargInstaticvoid {

	public static void main(String args[]) {
		/*
		 * for (int i = 0; i < 3; i++) { for (int j = 3; j >= 0; j--) { if (i == j)
		 * //continue; break; System.out.println(i + " " + j); } }
		 */

		/*
		 * for(int i =0 ; i < 3 ; i++) { if (i == 2) {
		 * 
		 * System.out.println("Super");} continue;
		 * 
		 * 
		 * }
		 */
		String str = new String("Java");
		char fourthChar = str.charAt(3);

		for (int i = 0; i < 3; i++) {
			//for (int j = 3; j <= 0; j++) {
				System.out.println(i + " " + i);

		//	}
		}
		
		List<String> arr = new ArrayList<String>();
		arr.add("Krishna");
		arr.add("Krishna");
		arr.add("Radha");
		arr.add("Shiva");
		
		Set<String> ssee = new HashSet<String>(arr);
		for(String ite : ssee) {
			System.out.println(ite);
		}
		
		

	}
}
