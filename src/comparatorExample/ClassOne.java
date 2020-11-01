package comparatorExample;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.Vector;
import java.util.concurrent.ConcurrentHashMap;

public class ClassOne {
	
	public static void main (String args[]) {	
		
		Collection collec;
		
		List lst; 
		Map mapp;
		Set sett;
		SortedSet srtSet;
		SortedMap srtMap;
		
		lst = new ArrayList<String>();
		lst = new LinkedList<String>();
		lst = new Vector<String>();
		
		mapp = new HashMap<Integer, String>();
		mapp = new Hashtable<Integer, String>();
		mapp = new TreeMap<Integer, String>();
		mapp = new LinkedHashMap<Integer, String>();
		
		SortedMap<String, String> srtMapp = new TreeMap<String, String>();
		srtMapp.put("Tr", "Transfer");
		srtMapp.put("De", "Deposit");
		srtMapp.put("Wt", "Withdrawel"); 
		//System.out.println(srtMapp);
		Map <Integer, String> mapp1 = new Hashtable<Integer, String>();
		mapp1.put(1, "ji");
		mapp1.put(1, "ji");
		mapp1.put(0, "ji");
		//mapp1.put(2, null);		
		//System.out.println(mapp1);
		
		Map<String, String> ccM = new ConcurrentHashMap<String, String> ();
		ccM.put("Rada", "Krishna");
		ccM.put("Krishna","Rdha" );
		ccM.put("Krishna","Rdha" );
		System.out.println(ccM);
		
	}

}
