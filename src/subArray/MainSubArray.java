package subArray;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

import org.springframework.beans.factory.annotation.Autowired;

public class MainSubArray {
	@Autowired
	B b;

	
	public static void main(String args[]) {
		
		String[] arr = { "A", "B", "C", "D", "E", "F", "G", "H" };
		List<String> arrayLst = new ArrayList<String>();
		arrayLst.add("Srikrishna");
		arrayLst.add("Radha");
		arrayLst.add("Shiva");
		arrayLst.add("Sakthi");
		arrayLst.add("kjh");
		arrayLst.add("mnmm");
		
//		arrayLst.subList(1, 4);
		//int beg = 1, end = 4;
		
		//String[] subarray = IntStream.range(beg, end + 1).mapToObj(i -> arr[i]).toArray(String[]::new);

		//System.out.println(Arrays.toString(subarray));;
		List<String> l=arrayLst.subList(0, 5);
		System.out.println(l);
		
		ArrayList<String> arr1 = new ArrayList<String>();
		arr1.addAll(l);
		System.out.println(arr1);
		
	}
}
