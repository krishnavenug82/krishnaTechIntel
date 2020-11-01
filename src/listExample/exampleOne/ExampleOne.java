package listExample.exampleOne;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ExampleOne {

	public static void main(String[] args) {
		
		List<String> lst = new ArrayList<String>();
		lst.add("Krishna");
		lst.add("Rama");
		lst.add("Raghu");
		lst.add("Krishna");
		lst.add("Krishna");
		lst.add("Rama");
		lst.add("Raghu");
		
		System.out.println(lst);
		
		Set<String> s = new HashSet<String>(lst);
		System.out.println(s);		

		List<String> lst1 = new ArrayList<String>(s);
		System.out.println(lst1);
		

	}

}
