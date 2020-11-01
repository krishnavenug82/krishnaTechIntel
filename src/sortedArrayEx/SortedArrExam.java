package sortedArrayEx;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.Vector;

 

public class SortedArrExam {
	
	public static void main (String args[]) {
		
		ArrayList<String> arrLst = new ArrayList<String>();
		arrLst.add("Krishna");
		arrLst.add("Vishnu");
		arrLst.add("Shiva");
		
		Collections.sort(arrLst,Collections.reverseOrder());
		//System.out.println(arrLst);
		
		
		List<String>  vec = new Vector<String>();
		vec.add("Krishna");
		vec.add("Ram");
		vec.add("Seetha");
		vec.add("Hanumaan");
		Collections.sort(vec);
		//System.out.println(vec);	
	
		
		HashMap<String, String> hasMaPEx = new HashMap<String, String>();
		hasMaPEx.put("Krishna","Kumar");
		hasMaPEx.put("Vishnu","Kannan");
		hasMaPEx.put("Vishnu","Kannans ");
		hasMaPEx.put("Shiva","Uma"); 
		hasMaPEx.put(null, "Krishna");
		hasMaPEx.put(null, "Vishnu");		
		
		//for(Map.Entry<String , String> ite : hasMaPEx.entrySet())
		//	System.out.println("ite ; " + ite.getKey());
		
		System.out.println(hasMaPEx);
		
		HashSet<String> hashSeEx = new HashSet<String>();
		hashSeEx.add("Partha");
		hashSeEx.add("Hanumaan");
		hashSeEx.add("Muruga");		
		//System.out.println(hashSeEx);
		
		
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30; 
		a[3] = 40;
		a[4] = 50;
		//System.out.println(a[4]);
		
		LinkedList<String> lnkLst = new LinkedList<String>();
		lnkLst.add("Krishna");
		lnkLst.add("Vishnu");
		lnkLst.add("Shiva");
		
		lnkLst.get(2);
	//	System.out.println(lnkLst.get(2));
		
		
		Set<String> sett = new HashSet<String>();		
		sett.add("Srikrishna");
		sett.add("Shiva");
		sett.add("Bharama");
		sett.add("Ganesh");	
		sett.add("Ganesh");	
		sett.add(null); 
		sett.add(null); 		
		System.out.println(sett);		
		
		
		Map<String, String> mad = new Hashtable<String,String>(); 
		mad.put("Chennai","Tamilnadu");
		mad.put("Mumbai", "Mahastra");
		mad.put("Calcutta", "WestBengal");
		//mad.put(null, "Delhi");		
		//System.out.println(mad);
		
		SortedSet <String> srtS = new TreeSet<String>();
		srtS.add("Xxx");
		srtS.add("Uma");
		srtS.add("Krishna");
		srtS.add("Shiva"); 		
		//System.out.println(srtS);
		
		Set <String> srtS1 = new HashSet<String>();
		srtS1.add("Uma");
		srtS1.add("Krishna");
		srtS1.add("Shiva");
		
		//System.out.println(srtS1);
		
	}

}
