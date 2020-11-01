package interfaceIsParent;

public class MainClassNInterface {
	
	public static void main(String args[]) {
		
		InterfaceA var = new ClassA();
		var.consumer();
		
		
		
		/*ClassA varb = (ClassA) var;
		System.out.println(varb.consumer());*/
		
	}

}
