package scenarioBasedExample.hashCodeCreation;

public class MainClassExample {

	public static void main(String args[]) {

		SampleClass testClass = new SampleClass();
		
		System.out.println(new SampleExampleTwo().hashCode() );
		//testClass.consumerName.hashCode();

		 testClass.consumerSalary(150, "Krishna Ram Shiva", new SampleClassThree(),new SampleExampleTwo()).hashCode();
		 
		// testClass.consumerLocation(new SampleExampleTwo().hashCode());
		 
		 
		 testClass.consumerSalaryCredit(150, "Krishna Ram Shiva", new SampleClassThree(),new SampleExampleTwo()).hashCode();
		
		System.out.println( testClass.consumerQualification(new SampleExampleTwo()).hashCode());
		

	}
}
