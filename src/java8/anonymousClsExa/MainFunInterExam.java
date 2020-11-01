package java8.anonymousClsExa;

public class MainFunInterExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FunInterExam func = new FunInterExam() {

			@Override
			public String customer(String name) {
				// TODO Auto-generated method stub
				return name;
			}

		};

		System.out.println(func.customer("Srikrishna"));

	}

}
