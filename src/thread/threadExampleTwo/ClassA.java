package thread.threadExampleTwo;

public class ClassA {

	
	synchronized int emiCalculation (int principle, int tenure, int interest) {
		return (principle * tenure * interest) ;
	}
	
	public int tenureCalcualtion (int principle, int tenure, int interest ) {
		
		return ((principle * tenure * interest)/principle);
	}
}
