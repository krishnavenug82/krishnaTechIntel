package java8.methodReference.methodRefExam;

import java.util.function.BiConsumer;
import java.util.function.Function;

public class MainForEmployeeMethodRef {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// To create Lambda expression ;
		EmployerInter balanceSheet = (year) -> {
		};
		balanceSheet.location("The world wide entertaintment");
		
		
		// Method Reference by Static;
		EmployerInter balance = Employees::address;
		balance.location("The global employer day ");
		
		// Method Reference by Static;
		Employees emp = new Employees();		
		EmployerInter lossNprofit = emp::salary;
		lossNprofit.location("The global employer day ");
		
		// Lambda expression for BiConsumer
		BiConsumer<String,String>  one = (x,y)->{System.out.println();};
		one.accept("Sri", "Radha");
		
		// Method reference with BiConsumer
		BiConsumer<String,String> two = Employees::department;
		two.accept("Shiva", "Shakthi");
		
		//Method reference with Function <T.R>
		Function<String, String> three = Employees::department;

	}

}
