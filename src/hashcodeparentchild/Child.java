package hashcodeparentchild;

import java.util.Objects;

public class Child extends Parent {

	public String name = "child";

	public void childMethod() {
		System.out.println("childMethod");
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if ((obj instanceof Parent)) {
			return false;
		}
		if(obj instanceof Child) {
			Child c=(Child) obj;
			if(c.name.equalsIgnoreCase(this.name ) && c.location.equalsIgnoreCase(this.location)) return true;
		}
		return false;
	}
}
