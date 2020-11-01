package fascadeDesignPattern.exampleTwo.asia;

import java.util.ArrayList;
import java.util.List;

import fascadeDesignPattern.exampleTwo.BankDTO;

public class BankBazzarFacadeAsia { 
	private ServiceLocator serviceLocator = new ServiceLocator();
	
	public List<BankDTO> emiCalculationForLoan(int principle, int years) {
		
		List<ServiceLocator> asianBankDtl = new ArrayList<ServiceLocator>();		

		List<BankDTO> emiClaculation = new ArrayList<BankDTO>();		
		BankDTO a = new BankDTO();
		
		a.setName("Citi");
		a.setEmi(serviceLocator.citiBankServicel.EmiCalculation(principle, years));
		emiClaculation.add(a);
		
		BankDTO b = new BankDTO();
		b.setName("ICICI");
		b.setEmi(serviceLocator.iciciBankServicel.EmiCalculation(principle, years));
		emiClaculation.add(b);
		
		BankDTO c = new BankDTO();
		c.setName("HDFC");
		c.setEmi(serviceLocator.hdfcBankServicel.EmiCalculation(principle, years));
		emiClaculation.add(c);

		return emiClaculation;
	}

	
	

	// Approach 1 ; 
	/*public List<BankDTO> emiCalculationForLoan(int principle, int years) {

		List<BankDTO> emiClaculation = new ArrayList<BankDTO>();

		CitiBank citiBank = new CitiBank();
		BankDTO a = new BankDTO();
		a.setName("Citi");
		a.setEmi(citiBank.EmiCalculation(principle, years));
		emiClaculation.add(a);

		IciciBank icicibank = new IciciBank();
		BankDTO b = new BankDTO();
		b.setName("ICICI");
		b.setEmi(icicibank.EmiCalculation(principle, years));
		emiClaculation.add(b);

		HdfcBank hdfcBank = new HdfcBank();
		BankDTO c = new BankDTO();
		c.setName("HDFC");
		c.setEmi(hdfcBank.EmiCalculation(principle, years));
		emiClaculation.add(c);

		return emiClaculation;
	}
*/
}
