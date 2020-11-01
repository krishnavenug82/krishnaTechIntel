package nestedClassExample.anonymousClassExample;

public class MainAnonClsExam {
	
	public static void main(String args[]) {
		
		AnonIntExam anonInt = new AnonIntExam() {

			@Override
			public String greet() {
				// TODO Auto-generated method stub
				
				String name = "Srikrishna";
				String pass = "RadhaKrish";
				return name + "" + pass;
			}
			
		};
	}
	   

}
