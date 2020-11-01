package java8.forEachexam.hashMapExam;

import java.util.Map;
import java.util.Map.Entry;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class School {

	
	
	/// ******************************* User defined Functional Interfaces only *********************************
	public String counts() {
		Student count = new Student();
		Map<String, Integer> totalNoOfStudent = count.student();

		InsteadOfClsSchool<String, Integer> scholl = new InsteadOfClsSchool<String, Integer>() {

			@Override
			public String studentCount(String t, Integer u) {
				// TODO Auto-generated method stub

				if (t.equals("Srikrishna") && u == 125) {

					System.out.println("Name " + t + "Age " + u);

					return t + "" + u;
				} else
					return "No value found";
			}

		};

		return null;

	}

	// **************************** By Biconsumer ****************************
	public String studentCount() {
		Student count = new Student();
		Map<String, Integer> totalNoOfStudent = count.student();
		for (Entry<String, Integer> ite : totalNoOfStudent.entrySet()) {
			if (ite.getKey().equals("Srikrishna") && ite.getValue() == 125) {
				return ite.getKey() + ite.getValue();
			} else
				return "No value found";
		}

		BiConsumer<String, Integer> pricipal = new BiConsumer<String, Integer>() {

			@Override
			public void accept(String t, Integer u) {
				// TODO Auto-generated method stub

				if (t.equals("Srikrishna") && u == 125) {

					System.out.println("T " + t + "U " + u);

					// return "No Value Found";

				}

			}

		};

		totalNoOfStudent.forEach(pricipal);
		return null;

	}

	// ****************************************** BI Function	// *************************************

	public String countOfStudent() {

		Student count = new Student();
		Map<String, Integer> result = count.student();

		BiFunction<String, Integer, String> valueOfBiFun = new BiFunction<String, Integer, String>() {

			@Override
			public String apply(String t, Integer u) {
				// TODO Auto-generated method stub

				if (t.equals("Srikrishna") && u == 125) {

					System.out.println("T " + t + "U " + u);

					return "Possitive approach " + t + " " + u;

				} else
					return "Nagative approach " + t + " " + u;
				
			}
		};

		//result.forEach(valueOfBiFun);

		return null;
	}
	
	// *********************** BiPredicate<T,U> **********************************

	
	public String studentCont() {
		Student count = new Student();
		Map<String, Integer> result = count.student();
		BiPredicate<String,Integer> studentCount = new BiPredicate<String,Integer>(){

			@Override
			public boolean test(String t, Integer u) {
				if (t.equals("Srikrishna") && u == 125) {

					System.out.println("T " + t + "U " + u);

					return false ;

				} else
					return true;
			}
			
		};
		
		result.forEach(action);
	
		
		return null;
		
	}
}
