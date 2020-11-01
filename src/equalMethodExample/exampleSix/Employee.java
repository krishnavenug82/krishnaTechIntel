package equalMethodExample.exampleSix;

public class Employee {
	
	String empName ;

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((empName == null) ? 0 : empName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		/*if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;*/
		Employee other = (Employee) obj;
		if(empName == other.empName) {
			return true;
		}
		else 
			return false ;
	}

}
