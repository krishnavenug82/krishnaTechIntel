package java8.methodReferenceExam;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodRefExample {
	
	public static List<String> consumer() {

		List<String> client = new ArrayList<String>();
		client.add("Srirkishna");
		client.add("Sriradha");
		client.add("Ram");
		client.add("Seetha");
		
		//Collections.sort(client);
		//System.out.println(client);
		
		
		return client;
	}
	
	public static void main(String args[]) {
		List<String> result = consumer();
		
		
		//result.forEach(l->{System.out.println( "With Lambda : "  + l.toString());});
		
		result.forEach(l->{});
		
		for(String ite : result ) {
			System.out.println( "Java7 : "  + ite.toString());
		}
		System.out.println("Result : " + result);
	}

}
