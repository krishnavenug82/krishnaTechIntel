package cloneExample.exampleTwo;

public class ClassOne implements Cloneable{
	
	public String consumer (String name) {
		
		System.out.println("name " + name );
		
		return name;
	}
	
	public Object  clone () {
		
		return new ClassOne();
		
	}

}
