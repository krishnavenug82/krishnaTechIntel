package homeWork.transientVariable;

import java.io.Serializable;

public class Student implements Serializable{
	
	 int id;  
	 String name;  
	 int age;//Now it will not be serialized  
	 
	 public Student(int id, String name,int age) {  
	  this.id = id;  
	  this.name = name;  
	  this.age=age;  
	 }  

}
