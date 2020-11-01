package instanceExample.exampleOne;

public class MainClassEg {
	
	public static void main(String args[]) {
		
		InstanceEgOne instanceOne = null;				
		System.out.println(instanceOne instanceof InstanceEgOne );
		
		InstanceEgOne instanceTwo = new InstanceEgOne();
		System.out.println(instanceTwo instanceof InstanceEgOne);
		
		
		
		
	}

}
