package java8.streamingExample.findLength;

import java.util.ArrayList;
import java.util.List;

public class FindLengthEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> names = new ArrayList<String>();
		names.add("Ajeet");
		names.add("Negan");
		names.add("Aditya");
		names.add("Steve");
			
		//Using Stream and Lambda expression
		long count = names.stream().filter(str->str.length()<6).count();
		
		String result = names.stream().findAny().equals("Steve");
		System.out.println();
		System.out.println("There are "+count+" strings with length less than 6");

	}

}
