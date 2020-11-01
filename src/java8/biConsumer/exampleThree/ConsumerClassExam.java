package java8.biConsumer.exampleThree;

import java.util.function.Consumer;

public class ConsumerClassExam implements Consumer<String> {

	

	@Override
	public void accept(String t) {
		// TODO Auto-generated method stub
		
		System.out.println("t" + t );
		
	}

}
