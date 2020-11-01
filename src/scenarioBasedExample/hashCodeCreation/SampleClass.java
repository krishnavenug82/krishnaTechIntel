package scenarioBasedExample.hashCodeCreation;

public class SampleClass {
	
	SampleClassThree motherName =  new SampleClassThree();

	String consumerName;
	
	int nameOfOrganisation;
	
	static String commercialName;
	
	final float licenseCode = 1205;

	public int consumerAge(int enterAge) {

		return enterAge;
	}

	public Double consumerLocation(SampleExampleTwo userLocation) {
		
		

		return 20.0;
	}
	 
	public SampleClassThree  consumerSalary (int userSalary, String address,SampleClassThree bankAccount,
			SampleExampleTwo PfAccount) {
		
		System.out.println(userSalary);
		
		return new SampleClassThree();
			
	}
	
	public Integer  consumerSalaryCredit(int userSalary, String address,SampleClassThree bankAccount,
			SampleExampleTwo PfAccount) {
		
		System.out.println(userSalary);
		 
		return  userSalary;
			
	}
	
	public SampleExampleTwo consumerQualification(SampleExampleTwo dd ) {
		
		dd.setAge(15);
		
		return new SampleExampleTwo();
	}
}
