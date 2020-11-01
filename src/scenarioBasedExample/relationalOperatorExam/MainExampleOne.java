package scenarioBasedExample.relationalOperatorExam;

import java.util.Optional;

public class MainExampleOne {

	int innin = 100_111;
	int ininini = 0b0001;

	public static void main(String args[]) {

		String consumer = "Krishna";
		String commercial = "Krishna";
		
		

		ExampleThree threeVar = new ExampleThree(150,"Krishna");
		ExampleThree fourVar = new ExampleThree(150,"Krishna");

		String strvar1 = new String("Krishna");
		String strVal2 = new String("Krishnas");
		  
		ExampleOne exOne = new ExampleOne();
		System.out.println(exOne.exThr == exOne.exFou); // F 
		System.out.println(exOne.interestOfAutoLoan == exOne.interestOfCarLoan); //F
		System.out.println(exOne.consumer == exOne.commercial);//F
		System.out.println(consumer == commercial);//T
		System.out.println(consumer.equals(commercial));//T
		System.out.println(threeVar.equals(fourVar));//T
		System.out.println(strvar1.equals(strVal2)); //T

	}

}
