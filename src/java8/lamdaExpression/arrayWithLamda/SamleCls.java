package java8.lamdaExpression.arrayWithLamda;

import java.util.ArrayList;
import java.util.List;

public class SamleCls {
	
	public List<String>	commer() {
		
		List<String> name = new ArrayList<String>();
		name.add("Srikrishna");
		name.add("Sriradha");
		name.add("Shiva");			
		
		return name;
	}

	public String student() {
		
		List<String> record = commer();
		
		for(String ite : record) {
			
			if(ite.equals("Srikrishna")) {
				
				return "First Mark";
			}
			
		}
		
		return "Last Mark";
	}
}
