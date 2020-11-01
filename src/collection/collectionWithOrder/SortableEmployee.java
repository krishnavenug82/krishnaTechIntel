package collection.collectionWithOrder;

public class SortableEmployee extends Employee implements Comparable<SortableEmployee>{
	

	SortableEmployee(String empname, int age, String location) {
		super(empname, age, location);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int compareTo(SortableEmployee o) {
		// TODO Auto-generated method stub
		if (this.age == o.age)
			return 0;
		else if (this.age > o.age)
			return 1;
		else
			return -1;
	}


}
