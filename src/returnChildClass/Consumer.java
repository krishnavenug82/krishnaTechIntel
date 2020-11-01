package returnChildClass;

public class Consumer extends Commercial{
	
	Client cln;
	
	public Consumer(){
		System.out.println( "Consumer");
		cln = new Client();
		
	}

}
