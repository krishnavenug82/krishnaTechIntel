package equalMethodExample.exampleThree;

public class DashBoard {

	public static void main(String args[]) {

		BankUser banker = new BankUser();
		
		BankUser banker1 =  banker;

		BankEmployer employer = new BankEmployer();

		System.out.println(banker.hashCode() == banker1.hashCode());

		System.out.println(banker.equals(banker1));

	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		
		
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}

}
