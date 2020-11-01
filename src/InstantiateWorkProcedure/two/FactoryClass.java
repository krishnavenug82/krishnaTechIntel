package InstantiateWorkProcedure.two;

public class FactoryClass {

	public static Employee createEmployee(String name) {

		Employee emp = new Employee();

		if (name.equals("A")) {
			emp.setAge(150);
		}

		else if (name.equals("B")) {
			emp.setAge(300);
		}
		return null;
	}

}
