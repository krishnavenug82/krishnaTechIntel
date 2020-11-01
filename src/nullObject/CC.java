package nullObject;

public class CC {
	
	CC(){
		
		int k = 100/0;
		
		System.out.println("COnstructoe");
		
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
	}

}
