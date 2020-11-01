package classHirarchy;


public class ExampleFour extends ExampleTwo {
	
	private ExampleTwo consumer;
	
	public ExampleTwo getConsumer() {
		return consumer;
	}

	public void setConsumer(ExampleTwo consumer) {
		this.consumer = consumer;
	}

	ExampleTwo egTwo = new ExampleTwo();

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
