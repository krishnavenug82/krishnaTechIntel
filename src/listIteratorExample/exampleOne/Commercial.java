package listIteratorExample.exampleOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Commercial {

	public Set<String> addCommercial() {

		Set<String> comm = new TreeSet<String>();
		comm.add("AT&T");
		comm.add("Verizon");
		comm.add("Lyca");

		return comm;
	}

	public List<String> addCommLocation() {

		List<String> locat = new ArrayList<String>();
		locat.add("Chennai");
		locat.add("Mumbai");
		locat.add("Calcutta");		
		Collections.sort(locat);
		return locat;

	}
}
