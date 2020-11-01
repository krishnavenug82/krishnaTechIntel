package fascadeDesignPattern.exampleTwo.Usa;

import java.util.ArrayList;
import java.util.List;

import fascadeDesignPattern.exampleTwo.BankDTO;


public class CreditBazarFascadeNam {	
	

	public List<BankDTO> emiCalculationForLoan(int principle, int years) {
		
		List<BankDTO> emiClaculation = new ArrayList<BankDTO>();
		
		RBS citiBank = new RBS();
		BankDTO a=new BankDTO();
		a.setName("Rbs");
		a.setEmi(citiBank.EmiCalculation(principle, years));
		emiClaculation.add(a);
		
		Merlinc icicibank = new Merlinc();
		BankDTO b=new BankDTO();
		b.setName("Merlinc");
		b.setEmi(icicibank.EmiCalculation(principle, years));
		emiClaculation.add(b);

		BOA hdfcBank = new BOA();
		BankDTO c=new BankDTO();
		c.setName("BOA");
		c.setEmi(hdfcBank.EmiCalculation(principle, years));
		emiClaculation.add(c);
		
		return emiClaculation;
	}

}
