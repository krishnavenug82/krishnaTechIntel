package cloneExample.exampleSix;

public class Employee {
	  int id;
	  
	    String name;
	 
	    Department dept;
	 
	    public Employee(int id, String name, Department dept) {
	        this.id = id;
	 
	        this.name = name;
	 
	        this.dept = dept;
	    }
	 
	    // Default version of clone() method. It creates shallow copy of an object.
	 
	    protected Object clone() throws CloneNotSupportedException {
	        return super.clone();
	    }
	

}
