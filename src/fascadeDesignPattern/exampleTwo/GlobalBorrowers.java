package fascadeDesignPattern.exampleTwo;

import java.util.List;

public class GlobalBorrowers {

	public static void main(String args[]) {

		GlobalFascade globalBorrower = new GlobalFascade();
		
		List<BankGlobalDTO> emiforGlobalBorrower = globalBorrower.emiCalculationGlobal(200000, 5);
		
		for (BankGlobalDTO ite : emiforGlobalBorrower) {
			System.out.println(ite.getRegionName());
			List<BankDTO> emiforRegionalBorrower = ite.getRegion();
			for (BankDTO ite1 : emiforRegionalBorrower) {
				System.out.println(ite1.getName() + " = " + ite1.getEmi());
			}

		}

	}

}
