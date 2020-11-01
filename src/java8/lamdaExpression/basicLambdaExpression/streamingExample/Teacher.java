package java8.lamdaExpression.basicLambdaExpression.streamingExample;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

	public static List<String> student() {
		List<String> classRoom = new ArrayList<String>();
		classRoom.add("First");
		classRoom.add("Second");
		classRoom.add("Third");
		classRoom.add("Fourth");
		classRoom.add("Fifth");
		classRoom.add("Sixth");
		return classRoom;
	}
	
 // ********************************************************************************************************

	public static void main(String args[]) {

		List<String> school = student();

		
 // ********************************************************************************************************
		// Count the List
		school.stream().count();

		if (school.stream().count() > 5) {
			System.out.println("Big number");
		}

		System.out.println("Count of Stream " + school.stream().count());		

 // ********************************************************************************************************
		// Stream with Lambda expression 
		
		school.stream().forEach(itr -> System.out.println("Stream with Lambda expression  :- " + itr));
		
 // *********************************************************************************************************
		
		// Streaming with filter 
		
		school.stream().filter(one -> one.endsWith("th")).forEach(sch-> System.out.println(sch));
		
 // *********************************************************************************************************

		if (school.stream().equals("First")) {

			System.out.println("The student fit in to classs");

		}

	}
}
