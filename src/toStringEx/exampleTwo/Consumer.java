package toStringEx.exampleTwo;

public class Consumer {
	
	String username;
	int age ;
	String location;
	
	Consumer(String username,int age,String location){
		
		this.age = age;
		this.location = location;
		this.username = username;
		
	}

	public String toString(){
	return this.username + "  " +this.age+ "  "+this.location; }

}
