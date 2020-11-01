package fascadeDesignPattern.exampleTwo;

import java.util.ArrayList;
import java.util.List;

import fascadeDesignPattern.exampleTwo.Australia.LoanBazarFascadeAus;
import fascadeDesignPattern.exampleTwo.Usa.CreditBazarFascadeNam;
import fascadeDesignPattern.exampleTwo.asia.BankBazzarFacadeAsia;

public class GlobalFascade {

	public List<BankGlobalDTO> emiCalculationGlobal(int principle, int years) {

		List<BankGlobalDTO> emiGlobal = new ArrayList<BankGlobalDTO>();
 
		BankGlobalDTO bankGlobalDtoAsia = new BankGlobalDTO();

		BankBazzarFacadeAsia asiaFascade = new BankBazzarFacadeAsia();
		bankGlobalDtoAsia.setRegionName("Asia");
		bankGlobalDtoAsia.setRegion(asiaFascade.emiCalculationForLoan(principle, years));
		emiGlobal.add(bankGlobalDtoAsia);

		BankGlobalDTO bankGlobalDtoNam = new BankGlobalDTO();
		CreditBazarFascadeNam namFascade = new CreditBazarFascadeNam();
		bankGlobalDtoNam.setRegionName("Nam");
		bankGlobalDtoNam.setRegion(namFascade.emiCalculationForLoan(principle, years));
		emiGlobal.add(bankGlobalDtoNam);

		BankGlobalDTO bankGlobalDtoAus = new BankGlobalDTO();
		LoanBazarFascadeAus ausFaccade = new LoanBazarFascadeAus();
		bankGlobalDtoAus.setRegionName("Aus");
		bankGlobalDtoAus.setRegion(ausFaccade.emiCalculationForLoan(principle, years));
		emiGlobal.add(bankGlobalDtoAus);

		return emiGlobal;
	}

}
