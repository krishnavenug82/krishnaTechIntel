package lambdaExression.exampleOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;


public class LambdaExpression {
	
	
	public List<Integer> consumer(){
		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);
		
		numbers.forEach((n)->{}) ;
		
		
	}

	public static void main(String args[]) {

		ArrayList<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(9);
		numbers.add(8);
		numbers.add(1);

		for (Integer ite : numbers) {
			System.out.println(ite);
		}
		numbers.forEach((n) -> {
			System.out.println(n);
		});
		
		Set<String> vari  = new HashSet<String>();
		vari.add("Zss");
		vari.add("aee");
		vari.add("jjj");
		
		System.out.println("vari" + vari);
		
		Map<String, String> varr = new HashMap<String, String>();
		varr.put("Sri","Krishn");
		varr.put("Man","Radha");		
		varr.put("Asdd","Ram");
		varr.put("Cat","Ram");

		System.out.println("varr" +varr );
	}
	
	
	

}
