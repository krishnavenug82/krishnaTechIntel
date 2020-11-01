package f5KeyExample.consumer;

public class Interest {

	int amount;
	int interestRate;
	int tenure;

	public int ageBasedInterest() {

		PersonalDetails personalInformation = new PersonalDetails();

		Income annualCtc = new Income();

		if ((personalInformation.age < 25) && (annualCtc.annualIncome() < 100000)) {
			return 10;
		}
		if ((personalInformation.age > 26 && personalInformation.age < 40) && (annualCtc.annualIncome() < 500000)) {
			return 15;
		}
		if (personalInformation.age > 40) {
			return 20;
		} 
		return 0;
	}
	
	public int principle(int requiredAmount, int interest, int years) {
		this.amount = requiredAmount;
		this.interestRate = ageBasedInterest();  
		this.tenure = years;
		return requiredAmount;
	} 

	public float emiCalculation() {
 		principle(amount, interestRate, tenure);
		float easyMonthlyInstallment = ((amount) * (interestRate / 100) * (tenure / 12));
		return easyMonthlyInstallment;
	}

}
