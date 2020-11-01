package cloneExample.exampleOne;

public class ExampleOne implements Cloneable {
	int rollno;  
	String name;  
	  
	ExampleOne(int rollno,String name){  
	this.rollno=rollno;  
	this.name=name;  
	}  
	
	public Object clone()throws CloneNotSupportedException{  
		return super.clone();  
		}  

}
