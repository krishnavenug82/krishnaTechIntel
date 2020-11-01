package comparableExample.exampleOne;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudent {

	public static void main(String args[]) {
		
		for(int i = 0 ; i < 10 ; ++i ) {
		List<Student> al= new ArrayList<Student>();   
		Student stud = new Student ();
		stud.setAge(i);
		stud.setCity("Newyork" + i);
		stud.setName("Krishna" + i );
		al.add(stud);
		
		
		
		Comparator<Student> cm2  =  Comparator.comparing(Student::getCity);	
		Collections.sort(al,cm2); 
		for(Student ite : al) {
			System.out.println(ite.getAge() + "" + ite.getCity()+ "' "+ite.getName());
		}
		}

	}

}
