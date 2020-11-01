package equalMethodExample.exampleTwo;

public class HashcodeEquals {

	public static void main(String[] args) {
		Student alex1 = new Student(1, "Alex");
		Student alex2 = new Student(1, "Alex");
		//Student alex2 = alex1;
		
		if (alex2 == alex1) {
			System.out.println("alex1 & alex2 is Equal" );
		} else {
			System.out.println("alex1 & alex2 is not Equal" );
		}
		

		System.out.println("alex1 hashcode = " + alex1.hashCode());
		System.out.println("alex2 hashcode = " + alex2.hashCode());
		System.out.println("Checking equality between alex1 and alex2 = " + alex1.equals(alex2));
		
		String s1 = "Srimadhavan";
		String s2 = "Srimadhavan";
		String s3 = "Sridharan";		
		String s4 = new String("Srimadhavan");
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		if (s1==s2) {
			System.out.println("S1==S2 is true");
		}else {
			System.out.println("S1==S2 is false");
		}
		if (s1.equals(s2)) {
			System.out.println("S1 equals S2  is true");
		}else {
			System.out.println("S1 equals S2 is false");
		}
		
		
		if (s1==s4) {
			System.out.println("S1==S4 is true");
		}else {
			System.out.println("S1==S4 is false");
		}
		if (s1.equals(s4)) {
			System.out.println("S1 equals S4  is true");
		}else {
			System.out.println("S1 equals S4 is false");
		}
	}
}