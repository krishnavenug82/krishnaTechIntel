package java8.forEachexam;

import java.util.ArrayList;
import java.util.List;

public class MainForEachExam {

	public static String employ() {

		List<String> names = new ArrayList<String>();

		names.add("Krisshna");
		names.add("Radha");
		names.add("Ram");
		names.add("Seetha");

		for (String ite : names) {
			if (ite.contains("Krishna")) {
				return "Usa";
			}
			if (ite.contains("Radha")) {
				return "UK";
			}
			if (ite.contains("Ram")) {
				return "Germany";
			} else
				return "Australiz";
		}
		
		names.forEach(city ->{
			if(city.contains("Krishna")) {
				
			}
			
			
		});
		  
		 
		return null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String naem = employ();
		System.out.println(naem);
	}

}
