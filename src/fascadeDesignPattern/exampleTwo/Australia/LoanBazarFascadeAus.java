package fascadeDesignPattern.exampleTwo.Australia;

import java.util.ArrayList;
import java.util.List;

import fascadeDesignPattern.exampleTwo.BankDTO;

public class LoanBazarFascadeAus {	
	

	public List<BankDTO> emiCalculationForLoan(int principle, int years) {
		
		List<BankDTO> emiClaculation = new ArrayList<BankDTO>();
		
		ZOB citiBank = new ZOB();
		BankDTO a=new BankDTO();
		a.setName("ZOB");
		a.setEmi(citiBank.EmiCalculation(principle, years));
		emiClaculation.add(a);
		
		AustraliaBank icicibank = new AustraliaBank();
		BankDTO b=new BankDTO();
		b.setName("AustraliaBank");
		b.setEmi(icicibank.EmiCalculation(principle, years));
		emiClaculation.add(b);

		ANZ hdfcBank = new ANZ();
		BankDTO c=new BankDTO();
		c.setName("ANZ");
		c.setEmi(hdfcBank.EmiCalculation(principle, years));
		emiClaculation.add(c);
		
		return emiClaculation;
	}

}
