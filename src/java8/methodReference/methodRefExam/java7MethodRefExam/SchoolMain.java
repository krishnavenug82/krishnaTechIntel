package java8.methodReference.methodRefExam.java7MethodRefExam;

public class SchoolMain {
	
	public static void main(String args[]) {		
		Teacher exam = new Student();
		int studentResult = exam.attendance("Welcome student");
		System.out.println(studentResult);		
	}
}
