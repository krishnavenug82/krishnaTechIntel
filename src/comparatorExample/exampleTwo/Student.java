package comparatorExample.exampleTwo;

public class Student {
	
	  int roll;
	  String name;
	  String loc;
	  Student(int r,String n)
	  {
	      roll = r;
	      name = n;
	  }
	  
	  Student(int r,String n,String l){
		  roll = r;
	      name = n;
	      loc = l;
	  }
	  
	  public String toString()
	  {
	      return roll+" "+name+" "+ loc;
	  }
 
	 
}
