package comparableExample.exampleWithSet;

public class Student implements Comparable<Student>{

	private String studentName;
	private int studentAge;

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getStudentAge() {
		return studentAge;
	}

	public void setStudentAge(int studentAge) {
		this.studentAge = studentAge;
	}

	

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		if(studentName == o.getStudentName())
		return 0;
		else if (studentName.equals(o.getStudentName()))
				return 1;
		else 
			 return -1;
				
			
	}

}
