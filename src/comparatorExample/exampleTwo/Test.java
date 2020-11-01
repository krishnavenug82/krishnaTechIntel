package comparatorExample.exampleTwo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.TreeSet;

public class Test {

	
		public static void main(String[] args){
			
			List<String> lst1 = new ArrayList<String>();
			lst1.add(new String("Krishna"));
			lst1.add(new String("Shiva"));
			Collections.sort(lst1);			
			//System.out.println(lst1);
			
			List<Teacher> lst = new ArrayList<Teacher>();
			lst.add(new Teacher("Krishna"));
			lst.add(new Teacher("Raghul")); 			
			//System.out.println(lst);
						
		   /* TreeSet<Student> ts = new TreeSet<Student>();
		    ts.add(new Student(45, "Rahul"));
		    ts.add(new Student(11, "Adam"));
		    ts.add(new Student(19, "Alex"));	
		  
		    System.out.println(ts);*/
		    
			TreeSet<String> ts3 =  new TreeSet<String>();
		    ts3.add("xx");
		    ts3.add("AAA");
		    ts3.add("MM");
		    System.out.println(ts3);
		    
		    
		   
		    
		    Student stu = new Student(100, "Krishna");
		  //  System.out.println(stu);
		    
		    TreeSet<Student> ts1 = new TreeSet<Student>(new MyComparatorByName());
		    ts1.add(new Student(45, "Rahul","NY"));
		    ts1.add(new Student(11, "Adam","CA"));
		    ts1.add(new Student(19, "Alex","GA"));
		    //System.out.println(ts1);
		    
		   }

	}


