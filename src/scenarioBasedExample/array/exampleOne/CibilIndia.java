package scenarioBasedExample.array.exampleOne;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CibilIndia {
	
	static int hashCde; 

	public static void main(String args[]) {

		int[] k = { 1, 5, 2, 8 };
		int[] l = new int[10];
		int h = 10;

		Consumer consume = new Consumer();
		consume.setName("Rama");
		consume.setAge(65);
		consume.setEducation("B.E");
		consume.setLocation("Chennai");

		Consumer consume1 = new Consumer();
		consume1.setName("Krishna");
		consume1.setAge(77);
		consume1.setEducation("B.Tech");
		consume1.setLocation("Mumbai");

		BankSBI bankSbi = new BankSBI();
		Consumer sbiBankUserDetails = bankSbi.consumer(new Consumer());

		Consumer[] cons = { consume, consume1, sbiBankUserDetails };
		for (int i = 0; i < cons.length; i++) {

			
			/* System.out.println("Name = " + cons[i].getName() + "\n" + "Age = " +
			 cons[i].getAge() + "\n" + "Location = " + cons[i].getLocation() + "\n" +
			 "Education = " + cons[i].getEducation());*/
			 

		}

		// ************************************ Array List   ***********************************************

		List<Consumer> consumers = new ArrayList<>();
		
		ICICIBank iciciBank = new ICICIBank();	
		
		Consumer employee = new Consumer();			
		consumers.add(iciciBank.addCustomer(employee));
		System.out.println(" iciciBank = " +  iciciBank.hashCode());		
		System.out.println(" addCustomer =  " + iciciBank.addCustomer(employee).hashCode());
		System.out.println("employee " + employee.hashCode());
		
		ICICIBank iciciBank1 = new ICICIBank();
		Consumer employee1 = new Consumer();	
		consumers.add(iciciBank.addCustomer(employee1));
		System.out.println(iciciBank1.addCustomer(employee1).hashCode());
		
		ICICIBank iciciBank2 = new ICICIBank();
		Consumer employee2 = new Consumer();	
		consumers.add(iciciBank.addCustomer(employee2));
		System.out.println(iciciBank2.addCustomer(employee2).hashCode());
		
		
				
		/*Consumer require = consumers.get(2);
		System.out.println("Elements based value "+"\n"+ "Name = " + require.getName() + "\n" + "Age = " + require.getAge() + "\n" + "Location = "
				+ require.getLocation() + "\n" + "Education = " + require.getEducation());
		*/
		
		 
		for (Consumer ite : consumers) {
			
			System.out.println(" ite  " + ite.hashCode()); 
							

			System.out.println("Name = " + ite.getName() + "\n" + "Age = " + ite.getAge() + "\n" + "Location = "
					+ ite.getLocation() + "\n" + "Education = " + ite.getEducation());
		}
		
		// ********************************** HashMap  ***********************************************************

		Map<Integer, Consumer> consmer = new HashMap<Integer, Consumer>();
		BankOfAmerica bankOfAmerica = new BankOfAmerica();

		
		
		consmer.put(1000,bankOfAmerica.consumer(new Consumer()));
		consmer.size();
		

		for (Map.Entry<Integer, Consumer> ite : consmer.entrySet()) {
			// System.out.println(ite.getKey() + "" + ite.getValue().getName());
		}

	}
}
	// *************************************************************************************************************


