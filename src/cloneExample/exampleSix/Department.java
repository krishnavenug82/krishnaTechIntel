package cloneExample.exampleSix;

public class Department implements Cloneable {

	String empId;
	 
    String grade;
 
    String designation;
 
    public Department(String empId, String grade, String designation) {
        this.empId = empId;
 
        this.grade = grade;
 
        this.designation = designation;
    }
}
