package accessModifierExample.twoExample;

public class TwoExample {

	String password;

	protected String name;

	protected TwoExample(String name) {

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
