package thread.threadExampleTwo;

public class threadExampleTwo implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		ClassA classA = new ClassA ();
		System.out.println(" Emi Calcuation "  + classA.emiCalculation(100, 1, 10));
		
		System.out.println("Tenure Calculation  " + classA.tenureCalcualtion(100, 1, 10));
		
	}
	
	
	
	

}
