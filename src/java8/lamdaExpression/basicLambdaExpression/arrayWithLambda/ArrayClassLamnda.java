package java8.lamdaExpression.basicLambdaExpression.arrayWithLambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import java8.methodReference.methodRefExam.Employees;

public class ArrayClassLamnda {

	// Simple Array list value display by Lambda expression;
	public static List<String> consumer() {
		List<String> personal = new ArrayList<String>();
		personal.add("KRishna");
		personal.add("Rama");
		personal.add("Seetha");
		personal.add("Radha");
		personal.add("Bhama");
		//personal.forEach(itr -> System.out.println(itr));
		return personal;

	}

	public static void main(String args[]) {

		List<String> getPersonalDtl = consumer();

		// **For each without Lambda expression
		for (String itr : getPersonalDtl) {
			//System.out.println("For each without lambda expression : - " + itr);
		}

		// **For each with Lamba expression

		//getPersonalDtl.forEach(itr -> System.out.println("For each with lambda expression : - " + itr));
		
		
		// *******************************************  by using interface consumer ******************
		
		
		
		Consumer<String> cos = new Consumer<String>(){

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub				
				System.out.println(t);				
			}			
		};
		getPersonalDtl.forEach(Employees::dummy );
		
		Employees emp  = new Employees();
		getPersonalDtl.forEach(emp::dummy1 );
	}

}
