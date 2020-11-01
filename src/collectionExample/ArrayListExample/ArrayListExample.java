package collectionExample.ArrayListExample;
import java.util.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListExample {

	 public static void main (String args[]) {
		 
		
		 
		 //List<String > arrayList = new ArrayList<String>();
		 //List<String > arrayList = new LinkedList<String>();
		 List<String > arrayList = new Vector<String>();
		 List<String > arrayList1 = new Vector<String>();
		 
		 		 
		 arrayList.add("Krishna");
		 arrayList.add("IyappaShiva");
		 arrayList.add("Krishna");
		 arrayList.add("Muruga");
		 arrayList.add("Shiva");
		 System.out.println("Add" + arrayList);
		 
		 arrayList1.add("RadhaKrishna");
		 arrayList1.addAll(arrayList);
		 System.out.println("Add All" + arrayList1);
				 
		 Collections.sort(arrayList);
		 System.out.println("sort" + arrayList);
		 
		 arrayList.remove("Shiva");	
		 arrayList.remove(2);
		 
		 System.out.println("Remove"+arrayList);
		 
		 arrayList.add(null);
		 arrayList.add(null);
		 System.out.println("Null"+arrayList);
		 
		 	 
		 arrayList.set(4, "Kanna");
		 System.out.println("set" + arrayList);
		 
		 Collections.replaceAll(arrayList,"Muruga","Ganesh");
		 System.out.println("replaceAll" + arrayList);
		 
		 
		
		 arrayList.clear();
		 System.out.println("Clear" + arrayList);
		 
		 arrayList.retainAll(arrayList);
		 System.out.println("Retains" + arrayList);
		 
		 
		 
		 
		 
		 
		 
		 
	 }
}
