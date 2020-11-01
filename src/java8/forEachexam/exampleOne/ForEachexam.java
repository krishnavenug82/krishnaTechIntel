package java8.forEachexam.exampleOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachexam {

	public static List<String> games() {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Chess");
		gamesList.add("Hocky");
		return gamesList;
	}

	public static Map<String, Integer> tornament() {

		Map<String, Integer> tornamentLIsr = new HashMap<String, Integer>();
		tornamentLIsr.put("Srikrishna", 120);
		tornamentLIsr.put("SriRam", 254);
		tornamentLIsr.put("SriseethaRadha", 584);
		return tornamentLIsr;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// **************** Array List ***********************
		List<String> gamesList = games();

		Consumer<String> one = new Consumer<String>() {
			@Override
			public void accept(String arg0) {
				// TODO Auto-generated method stub
				System.out.println(arg0);
			}
		};

		gamesList.forEach(one);

		// ************************** Hash map *******************************

		Map<String, Integer> gamesListMap = tornament();

		for (Entry<String, Integer> ite : gamesListMap.entrySet()) {

		//	System.out.println(ite);

		}

		BiConsumer<String, Integer> three = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String arg0, Integer arg1) {
				// TODO Auto-generated method stub

				System.out.println("Key = " + arg0 + "\n"+" value = " + arg1);
			}
		};
		
		gamesListMap.forEach(three);
	}

}
