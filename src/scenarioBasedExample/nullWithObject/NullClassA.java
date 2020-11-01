package scenarioBasedExample.nullWithObject;

public class NullClassA {

	public void serviceChargeperTransaction(NullClassA enterValue) {

		if (enterValue == null)
			System.out.println( "PerTransaction:-  "  +" The value is not entered");
		if (enterValue != null)
			System.out.println("PerTransaction:-  "  +" The value successfully entered");

	}
	
	public void serviceChargeGroupTransaction(int enterValue) {

		if (enterValue == 0)
			System.out.println("GroupTransaction:-  "  +" The value is not entered");
		if (enterValue != 0)
			System.out.println("GroupTransaction:-  "  +" The value successfully entered");

	}
	
	public void serviceChargeSplTransaction(String enterValue) {

		if (enterValue == null)
			System.out.println("SplTransaction:-  "  +" The value is not entered");
		if (enterValue != null)
			System.out.println("SplTransaction:-  "  +" The value successfully entered");

	}
	
	public void serviceChargeCorporateTransaction(Double enterValue) {

		if (enterValue == null)
			System.out.println("CorporateTransaction:-  "  +" The value is not entered");
		if (enterValue != null)
			System.out.println("CorporateTransaction:-  "  +" The value successfully entered");

	}
	
	public void serviceChargeAssociateTransaction(Integer enterValue) {

		if (enterValue == null)
			System.out.println("AssociateTransaction:-  "  +" The value is not entered");
		if (enterValue != null)
			System.out.println("AssociateTransaction:-  "  +" The value successfully entered");

	}
	

}
