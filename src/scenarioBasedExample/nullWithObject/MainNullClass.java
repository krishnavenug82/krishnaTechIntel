package scenarioBasedExample.nullWithObject;

public class MainNullClass {

	
	public static void main (String args[]) {
		
		NullClassA nullClassA = new NullClassA();
		nullClassA.serviceChargeperTransaction(null);
		nullClassA.serviceChargeGroupTransaction(0);
		nullClassA.serviceChargeSplTransaction("Completed");
		nullClassA.serviceChargeCorporateTransaction(null);
		nullClassA.serviceChargeAssociateTransaction(0);
	}
}
