package comparatorExample.exampleThree.regularCollection;

import java.util.Comparator;

public class ConsumerSortByName implements Comparator<Consumer>{

	@Override
	public int compare(Consumer arg0, Consumer arg1) {
		// TODO Auto-generated method stub
		return arg0.getName().compareTo(arg1.getName());
	}

}
