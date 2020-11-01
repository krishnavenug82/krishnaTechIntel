package java8.forEachexam.arrayExam;

import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import oracle.sql.DATE;

public class MainEmployee {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		Employee emp  = new Employee ();
		List<String> countOfEmpl = emp.employee();
		
		//********************************  Consumer ***********************
		
		Consumer<String> cons = new Consumer<String>() {

			@Override
			public void accept(String t) {
				// TODO Auto-generated method stub
				
				
				if(t.equals("Srikrishna")) {
					System.out.println("Name is valid");
				} if(t.contains("Srikris")) {
					System.out.println("Char is valid");
				}
				
				else 
					System.out.println("Name is not valid");
			}
			
		};
		
		countOfEmpl.forEach(cons);
		
		// ******************************** Supply **********************************
		
		Supplier<String> suply = new Supplier<String>() {

			@Override
			public String get() {
				// TODO Auto-generated method stub
				
				
				return null;
			}
			
		};
		//countOfEmpl.forEach(action);
		//************************************** Function ****************************
		
		Function<String, Integer> func =  new Function<String, Integer>(){

			@Override
			public Integer apply(String t) {
				// TODO Auto-generated method stub
				
				if(t.equals("Srikrishna")) {
					return 1;
				} if(t.contains("Srikris")) {
					return 0;
				}
				
				else 
					return 11;
			}
			
			
			
		};
		String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(Calendar.getInstance().getTime());
		System.out.println(timeStamp);
		countOfEmpl.forEach(v -> System.out.println(v));
		System.out.println(timeStamp);
		
	}

}
