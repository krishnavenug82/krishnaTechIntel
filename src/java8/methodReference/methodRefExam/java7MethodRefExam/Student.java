package java8.methodReference.methodRefExam.java7MethodRefExam;

public class Student implements Teacher {

	public int countOfStudent(int t) {
		System.out.println("Regular method :- " + t);
		return 52;	
		}

	public static int studentMarkLst(int t) {
		System.out.println("Static  method :- " + t);
		return 100;
		}

	@Override
	public int attendance(String g) {
		// TODO Auto-generated method stub		
		System.out.println("Override :- " + g);
		return 0;
		}
	}
