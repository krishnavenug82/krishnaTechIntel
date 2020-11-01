package scenarioBasedExample.hashCodeCreation;

import java.util.ArrayList;
import java.util.List;

public class Main {
	

	public static void main(String[] args) {
		
		List<Calculation>  calcu = new ArrayList<>();
		
		//Calculation validate = new Calculation();
		
		Calculation calcon = new Calculation();		
		calcu.add(calcon);
		System.out.println(calcon.hashCode());
		
		
		Calculation calcon1 = new Calculation();		
		calcu.add(calcon1);
		System.out.println(calcon1.hashCode());
		 
		
		for (Calculation ite : calcu )
			
	   System.out.println(ite.hashCode());
		
		Object varb = new Object();
		
	
		Object varA = new Calculation ();
		
		Calculation varC = (Calculation)varA;
		 
		Calculation k = new Calculation();
		Object obj =  (Calculation)k;
		
		
		
		
		
	}

}
