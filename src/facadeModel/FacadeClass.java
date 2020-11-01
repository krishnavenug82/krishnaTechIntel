package facadeModel;

public class FacadeClass {
	
	Employee userName;
	
	public FacadeClass (Employee name){
		
		this.userName = name;
	}
	
	public void draw() {
		userName.getAge();
	}
 
}
