package classHirarchy;

public class ExampleThree implements ClassFive{
	
	public String consumer(String name) {
		
		ExampleTwo two = new ExampleTwo();
		two.toString();
		return name;
	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}

}
