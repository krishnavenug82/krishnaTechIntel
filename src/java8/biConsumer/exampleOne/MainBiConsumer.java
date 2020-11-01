package java8.biConsumer.exampleOne;

import java.util.function.BiConsumer;

public class MainBiConsumer {
	
	public static void main(String args[]) {
		
		
		BiConsumer<String, Integer> conm = BiConsumerInterfaceExample::shoedetails;
		conm.accept("Krishna", 100);
		conm.accept("Ram", 200);
		conm.accept("Balaram", 78);
		
		
		
	}

}
