package java8.lamdaExpression.basicLambdaExpression.howLamdaWorks;

public class Employer {

	// Anonymouns Class
	Employee emp = new Employee() {

		@Override
		public int noOfClient(int a) {
			// TODO Auto-generated method stub
			return a * (100 * 2);
		}
	};

	public void fundTransfer() {
		System.out.println("This is value from anonymous : - " + emp.noOfClient(12));
	}

	public int interest() {
		return emp.noOfClient(100);
	}

	
	// Lambda Expression
	public void swiftTransfer() {
		Employee emps = (int a) -> {
			return (a * 100);
		};
		System.out.println("This is value from LambdaExpression : - " + emps.noOfClient(77));
	}

	public int interfundTransfer() {

		Employee emps = (int a) -> {
			return a * 111;
		};
		return emps.noOfClient(7);
	}
}
