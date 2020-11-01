package hashMapExample.exampleOne;

public class ClassOne {
	
	int age = 52;
	String name = "Shiva" ;

public boolean equals(ClassTwo obj) {
	// TODO Auto-generated method stub
	
	if(this.age==obj.age && this.name.equalsIgnoreCase(obj.name)) {
		return false;
	}else{
		return true;
	}
}
}
