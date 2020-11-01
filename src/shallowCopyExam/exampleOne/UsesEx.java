package shallowCopyExam.exampleOne;

public class UsesEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] vals = { 3, 7, 9 };
		Ex e = new Ex(vals);
		e.showData(); // prints out [3, 7, 9]
		vals[0] = 13;
		e.showData(); // prints out [13, 7, 9]

		// Very confusing, because we didn't
		// intentionally change anything about
		// the object e refers to.
	}

}
