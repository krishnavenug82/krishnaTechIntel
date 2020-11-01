package homeWork.ChildAndParent;

public  class ClassOne {
	static ClassThree instancevar;
	
	public static void main(String args[]) {
		
		instancevar = new ClassThree();		
		instancevar.consumer();
				
		instancevar = new ClassTwo();		
		instancevar.consumer();// second method*/
		
				
	}

}
