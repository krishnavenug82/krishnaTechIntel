package comparableExample.exampleThree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Clients {
	
	public static void main (String arg[]) {
		
		List<Commercial> provison = new ArrayList<Commercial>();
		
		
		provison.add(new Commercial("Krishna", 145, "Chennai",452f));
		provison.add(new Commercial("Shiva", 245, "Mumbai",552f)); 
		provison.add(new Commercial("Bharama", 345, "Calcutta",652f));
		
			for(Commercial ite : provison)	{
				System.out.println(ite.age + "\n" + ite.dob + " \n" + ite.location+ " \n" + ite.name);
			}
		
		/*while (provison.iterator().hasNext()) {
			System.out.println(provison.iterator().next());
		}*/
	}  
}
