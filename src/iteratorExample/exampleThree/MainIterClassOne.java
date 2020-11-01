package iteratorExample.exampleThree;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class MainIterClassOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<IterClassOne> lst = new ArrayList<IterClassOne>();

		IterClassOne iterClsOne = new IterClassOne();
		iterClsOne.setAge(120);
		iterClsOne.setName("Srikrishna");

		IterClassOne iterClsTwo = new IterClassOne();
		iterClsTwo.setName("Shiva");
		iterClsTwo.setAge(130);

		lst.add(iterClsOne);
		lst.add(iterClsTwo);

		for (IterClassOne ite : lst) {
			System.out.println(ite.getAge() + "\n" + ite.getName());

		}
		
		Iterator<IterClassOne> iteLst = lst.iterator();
		
		while(iteLst.hasNext()) {
			System.out.println(iteLst.next().getName() + "\n" + iteLst.next().getAge());
		}

		ListIterator<IterClassOne> lstIteLst = lst.listIterator();

		while (lstIteLst.hasNext()) {

			iteLst.remove();
			
			
		}
	}

}
