package java8.functionalInterExam;

public class MainFunctionalInterfaceExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunctionalInterfaceEx func = (name) -> {

			System.out.println(name);
		};

		func.commercial("Sriradhakrishnan");
	}

}
