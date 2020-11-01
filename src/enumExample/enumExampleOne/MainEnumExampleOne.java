package enumExample.enumExampleOne;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class MainEnumExampleOne {
	@SuppressWarnings(value = { "good" })
	public static void prin() {
		
		System.out.println("test ");
		
	}
	
	public static void main (String args[]) {
		
		prin();
		
		EnumExampleOne nam = EnumExampleOne.Bharama;
		int resule  = EnumExampleOne.inter;
		
		System.out.println(nam.toString());
		System.out.println(resule);
		
		Map<String, String> ha = new HashMap<String, String>();
		ha.put("arun", "kjkj");
		ha.put("xsds", "kjkj");
		ha.put("kiull", "kjkj");
		ha.put("kiull", "kjkj");
		ha.put(null, "kjkj");
		ha.put(null, null);
		
		
		
		System.out.println(ha);
		
		Set<String> hjh = new LinkedHashSet<String>();
		hjh.add("Krishna");
		hjh.add("Cii");
		hjh.add("loik");
		hjh.add("loik");
		hjh.add(null);
		hjh.add(null);
		
		System.out.println(hjh);
		
		
		
	}

}
