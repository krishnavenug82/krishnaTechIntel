package collection;

import java.util.ArrayList;
import java.util.List;

public class ListClass {

	public static void main(String args[]) {

		List<String> lst = new ArrayList<String>();
		lst.add("Srikrishna");
		lst.add("Krishna");
		lst.add(null);
		lst.add("Srikrishna");
		lst.add(null);
		System.out.println("ArrayList =  " + lst);

	}

}
