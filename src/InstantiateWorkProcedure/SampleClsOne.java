package InstantiateWorkProcedure;

public class SampleClsOne {

	String name;
	int age;

	SampleClsOne(String name) {

		this.name = name;
		
		factory();

	}

	public int factory() {
		if (this.name.equals("A")) {
			return 10;
		} else if (this.name.equals("B")) {
			return 20;
		} else if (this.name.equals("C")) {
			return 30;
		}

		return 0;
	}

}
