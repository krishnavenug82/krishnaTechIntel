package constructorExample.constructorAndNonConstructor;

public class ClassB extends ClassA {
	int interst;
	String name;

	ClassB(String userName, int location, int age) {
		super(userName, age);
		int resul = super.totalAmount;
		this.interst = resul;
		String name = super.consuer(userName);
		this.name = name;
		// TODO Auto-generated constructor stub
	}

	void consumer() {

		ClassC clsC = new ClassC();
		clsC.methods(name, interst);
	}

}
