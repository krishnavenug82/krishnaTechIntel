package scenarioBasedExample.relationalOperatorExam;

public class ExampleThree {
	
	int hh = 10;

	
	ExampleThree(int calculator, String principle) {

	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hh;
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ExampleThree other = (ExampleThree) obj;
		if (hh != other.hh)
			return false;
		return true;
	}

}
