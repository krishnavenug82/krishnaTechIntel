package instanceOfObject;

public class MainClass {

	public static void main(String args[]) {
		
		
		for (int i=1;i<=50; i++) {
			Object nn = "new "+"ClassExam" + i +"()";
			
			System.out.println(nn);
		}

		InterfaceExam intCla = nn;

		if (intCla instanceof InterfaceExam) {

			System.out.println("Yes");
		} else
			System.out.println("No");

	}

}
