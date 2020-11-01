package f5KeyExample.consumer;

public class SeniorCalculation {

	public static void main(String args[]) {

		PersonalDetails borrowerDetails = new PersonalDetails();
		borrowerDetails.name("Srikrishna");
		borrowerDetails.address("Brindavanam"); 
		borrowerDetails.age(125);

		
		Income borrowersalary = new Income();
		borrowersalary.fixedIncome(1000000);
		borrowersalary.variableIncome(255555);
		

		Interest borrowerinterst = new Interest(); 
		borrowerinterst.principle(10000, 15, 20);

		System.out.println("Final = " + borrowerinterst.emiCalculation());

	}

}
