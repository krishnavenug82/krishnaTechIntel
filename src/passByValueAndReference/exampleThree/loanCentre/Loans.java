package passByValueAndReference.exampleThree.loanCentre;

public class Loans {
	
	Interest interst = new Interest();
	
	public float autoLoan(int principle, int year) {
		
		float emi = ((principle*(year*12)*(interst.getAutoLoan()/100))/12);
		
		 
		return emi;
		
		
	}
	
	public int homeLoan(Interest emi) {
		
		return 0;
	}
	
	public int personalLoan(Interest emi) {
		
		return 0;
	}

}
