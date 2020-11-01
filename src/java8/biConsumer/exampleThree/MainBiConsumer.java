package java8.biConsumer.exampleThree;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class MainBiConsumer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Consumer<String> names = (a)-> {System.out.println("Srikrishna")};

		Consumer<String> addName = new ConsumerClassExam();
		addName.accept("Srikrishn");

		Consumer<String> addCity = (n) -> {
			
			System.out.println(n);
			
		};
		
		addCity.accept("Sriram");
		

		Consumer<String> add = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub

			}

		};
		add.accept("Srikrishna");

	}

}
