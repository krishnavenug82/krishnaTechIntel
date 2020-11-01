package homeWork.ChildInterfaceParent;

public class MainInterfaceClass {
	
	static ChildInterfaceParent childInterfaceParent;
	
	public static void main (String args[]) {
		
		childInterfaceParent = new InterNClass2(); 		
		childInterfaceParent.methods();
		
		childInterfaceParent = new InterNClass();
		childInterfaceParent.methods();
	}

}
