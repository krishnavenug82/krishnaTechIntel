package comparatorExample.exampleThree.regularCollection;

import java.util.Comparator;

public class ConsumerSortByID implements Comparator<Consumer>{

	@Override
	public int compare(Consumer o1, Consumer o2) {
		// TODO Auto-generated method stub
		return o1.getEmpId() - o2.getEmpId();
	}
	

}
