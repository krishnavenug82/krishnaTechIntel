package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetClass {
	
	public static void main(String args[]) {
		
		
		Set<String> set =  new HashSet<String>();
		set.add("Srikrishna");
		set.add("");
		set.add(null);
		set.add(null);
		set.add("ASrikrishna" );	
		set.add("Srikrishna");
		System.out.println("HashSet = " + set);
		
		Set<String> set1 =  new LinkedHashSet<String>();
		set1.add("Srikrishna");
		set1.add("");
		set1.add(null);
		set1.add(null);
		set1.add("Srikrishna");	
		set1.add("ASrikrishna");	
		System.out.println("LinkedHashSet =  " + set1);
		
		Set<String> set2 =  new TreeSet<String>();
		set2.add("Srikrishna");
		set2.add("");
		set2.add(null);
	//	set2.add(null);
		set2.add("Srikrishna");	
		set2.add("ASrikrishna");	
		System.out.println("TreeSet =  " + set2);
		
		
	}

}
