package instanceExample.exampleFour;

public class MainConsumerCommercial {
	
	public static void main(String args[]) {
		
		Consumer one = new Consumer();
		
		Commercial two = new Commercial();
		
		Commercial three = new Consumer();
		
		Consumer four = (Consumer) three;		
		
		System.out.println(one instanceof Consumer); // True 
		System.out.println(two instanceof Commercial); // True 
		/**
		 * System.out.println(one instanceof Commercial); //  Compile time exception False 
		 */
		/** 
		 * System.out.println(two instanceof Consumer); //    Compile time exception False 
		 */
		
		System.out.println(three instanceof Consumer); 
		System.out.println(three instanceof Commercial);
		System.out.println(four instanceof Consumer);
		System.out.println(four instanceof Commercial);
		
		
		
		
		
	}

}
