package scenarioBasedExample.hashCodeNEqualMethod;

public class MainExampleOne {
	

	public static void main(String[] args) {
		String carLoan = "Bentle";
		String autoLoan =  "Rolls Royce";
		
		
// ******************************************  Two Object are equal using == (Relational operator) *****************************
		ExampleOne examplel = new ExampleOne();
		ExampleOne example2 = examplel;		
		System.out.println((examplel == example2));		
			
		
// ******************************************** Whether two object are equal by using (equal method) ******************************		
		
		
		ExampleThree exampleThree = new ExampleThree();
		exampleThree.consumer = "Krishna";
		exampleThree.consumerAddress = "121 Lakshmi kadasam nagar";
		
		ExampleThree exampleFour = new ExampleThree();
		exampleFour.consumer = "Krishna";
		exampleFour.consumerAddress = "121 Lakshmi kadasam nagar" ; 		
		
		System.out.println(" Eqqual = " + exampleThree.equals(exampleFour));
		System.out.println(" Eqqual of Variable = " + carLoan.equals(autoLoan));
		
// ******************************************** By using equal methods example 1 *******************************************				
		ExampleOne exampleOne = new ExampleOne();
		System.out.println(exampleOne.equals(null)); 
		System.out.println(exampleOne.equals(new ExampleTwo()));
		System.out.println(exampleOne.equals(exampleOne));
		System.out.println(exampleOne.equals(new ExampleOne()));   
		
// *****************************************  Append String by using String builder and String buffer *****************************		
		StringBuffer strBuf = new StringBuffer("Henko");
		strBuf.delete(1,3);
		strBuf.insert(1,"j");
		System.out.println("strBuf : - "+strBuf);
		
		
		StringBuilder strBui = new StringBuilder("Henko");
		strBui.delete(1, 3);
		strBui.insert(1, "j");
		System.out.println("strBui : - "+strBui); 
// **************************************************  Over ride Hash code and equal method  *********************************	
		
		ExampleFour varExFour = new ExampleFour();
		ExampleFour varExFive = new ExampleFour();
		
		System.out.println(varExFour.equals(varExFive));
		
	}

}
