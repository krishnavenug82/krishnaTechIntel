package removeDuplicNArrayLst;

public final class Employee {
	String name;
	int age;
	String desig;
	String date;

	Employee(String name, int age, String desig, String date) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String toString (String name, int age, String desig, String date) {
		
		return this.name + "" + this.age + "" + this.desig + "" + this.date;
	}

	
}
