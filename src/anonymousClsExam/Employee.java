package anonymousClsExam;

public class Employee {

	private String name;

	private String password;

	public final void consumer(int a, int b) {
		System.out.println("Final key word " + " = " + (a * b));
	}

	public void consumer(int a, int b, int c) {
		System.out.println("Final key word " + " = " + (a * b));
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
