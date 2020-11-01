package comparatorExample.exampleThree.regularCollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainConsumer {

	
	public static void main(String args[]) {
		
		
		
		List<Consumer> addConsumer = new ArrayList<Consumer>();
		addConsumer.add(new Consumer("Ram", 32, "CA"));
		addConsumer.add(new Consumer("Krishna", 22, "NJ"));
		addConsumer.add(new Consumer("Muru", 12, "NJ"));
		
		System.out.println( "Sorted by Name "  );
		Collections.sort(addConsumer, new ConsumerSortByName());		
		for (int i=0; i<addConsumer.size(); i++) 
            System.out.println( addConsumer.get(i)); 
		
		System.out.println( "Sorted by Emp ID" );
		Collections.sort(addConsumer, new ConsumerSortByID());		
		for (int i=0; i<addConsumer.size(); i++) 
            System.out.println( addConsumer.get(i)); 
		
		Collections.sort(new ArrayList<String>());
	}
	
	

}
