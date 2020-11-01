package thread.exampleFiveWithDb;

import org.apache.log4j.Logger;

public class ThreadCustomer {
	final static Logger logger = Logger.getLogger(AddCustomers.class);
	
	

	public static void main(String args[]) {

		int i = 0;
  
		do {
			Thread newAddCustomer = new Thread(new MainAddCustomer(i),  i+"");
			
			
			newAddCustomer.start();
			

			i++;

		} while (i < 120);

		/*
		 * Thread newAddCustomer = new Thread(new MainAddCustomer());
		 * newAddCustomer.start();
		 */

		/*
		 * Thread newUpdateCustomer = new Thread(new MainUpdateCustomer());
		 * newUpdateCustomer.start();
		 * 
		 * Thread newSearchCustomer = new Thread(new MainSearchCustomer());
		 * newSearchCustomer.start();
		 */

	}

}
