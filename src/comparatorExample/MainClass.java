package comparatorExample;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class MainClass {

	public static void main (String args[]) {
		// creating a TreeSet 
	      TreeSet <Integer>treeadd = new TreeSet<Integer>();
	      TreeSet <Integer>treereverse = new TreeSet<Integer>();

	      // adding in the tree set
	      treeadd.add(1);
	      treeadd.add(13);
	      treeadd.add(17);
	      treeadd.add(2);
	      
	      System.out.println(treeadd);

	      // creating reverse set
	      treereverse = (TreeSet)treeadd.descendingSet();

	      // create descending set
	      Iterator iterator;
	      iterator = treereverse.iterator();

	      // displaying the Tree set data
	      System.out.println("Tree set data in reverse order: ");     
	      
	      while (iterator.hasNext()) {
	         System.out.println(iterator.next() + " ");
	      }
		
	}
}