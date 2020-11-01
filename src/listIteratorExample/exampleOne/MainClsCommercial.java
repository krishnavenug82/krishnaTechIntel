package listIteratorExample.exampleOne;

import java.util.Iterator;

public class MainClsCommercial {

	public static void main(String args[]) {

		Commercial commercial = new Commercial();

		Iterator it = commercial.addCommercial().iterator();

		while (it.hasNext()) {
			String obj = (String) it.next();
			System.out.println(obj);
		}

		Iterator it1 = commercial.addCommLocation().listIterator();
		while (it1.hasNext()) {
			String obj = (String) it1.next();
			System.out.println(obj);
		}

		int it2 = commercial.addCommLocation().listIterator().previousIndex();
		System.out.println(it2);
		
		System.out.println(commercial.addCommLocation().listIterator().nextIndex());
		
		/*while(it2)

			System.out.println(it2);

		} else { 
			System.out.println("Nothing");
		}*/

	}

}
