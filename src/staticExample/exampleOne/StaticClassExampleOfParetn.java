package staticExample.exampleOne;

public class StaticClassExampleOfParetn {
	
	static int loan;
	double interest;
	int year;
	
	StaticClassExampleOfParetn() {
		
		
	}

	
	void emiCalculation(int principle, int interest, int year) {
		
		this.loan = principle;
		this.interest = interest;
		this.year = year;
		
		System.out.println((principle * (interest /100))/12); 
				
	}
}
