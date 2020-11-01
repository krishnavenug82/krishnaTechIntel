package lambdaExression.withLambda;

import java.util.ArrayList;
import java.util.List;

public class ArrayLstExa {

	public List<String> connn() {

		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");
		System.out.println("Without " + list);

		list.forEach((n) ->

		System.out.println(n));

		return list;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> list = new ArrayList<String>();
		list.add("ankit");
		list.add("mayank");
		list.add("irfan");
		list.add("jai");
		System.out.println("Without " + list);

		list.forEach((n) ->

		System.out.println(n));
		
		

	}

}
