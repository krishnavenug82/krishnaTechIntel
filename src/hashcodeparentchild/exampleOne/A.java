package hashcodeparentchild.exampleOne;

public class A {

	String name = "Krishna";

	@Override
	public boolean equals(Object obj) {

		if (obj instanceof B) {
			B b = (B) obj;
			if (b != null && b.name.equalsIgnoreCase(this.name)) {
				return true;
			} else
				return false;
		} else if (obj instanceof C) {
			return false;
		} else if (obj instanceof A) {
			A a = (A) obj;
			if (a != null && a.name.equalsIgnoreCase(this.name)) {
				return true;
			} else
				return false;
		} else if (obj instanceof E ) {
			E e =(E) obj;
			if(e!= null && !(e.userName== null) && e.userName.equalsIgnoreCase(name)){
				return true;
			}
		
		}else return false;
		return false;
		
	} 

}
