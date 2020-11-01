package fascadeDesignPattern.exampleTwo;

import java.util.List;

import fascadeDesignPattern.exampleTwo.asia.BankBazzarFacadeAsia;

public class Borrower {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankBazzarFacadeAsia bankBazzar = new BankBazzarFacadeAsia();
		List<BankDTO> findEmi = bankBazzar.emiCalculationForLoan(10000, 2);
		for(BankDTO ite :findEmi) {
			System.out.println(ite.getName()+ " = " +ite.getEmi());
		}
		
		
	}
	

}
