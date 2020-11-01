package singleTonExample;

public class SingletonCla {
	
	private static SingletonCla sTC =  null;
	 
	 static SingletonTwo sTC2 = new SingletonTwo();
	
	
	
	private SingletonCla(){	}
	
	/**
	 * @return
	 */
	public static SingletonCla getInstance() {
		
		if (sTC != null) {
		
			sTC = new SingletonCla();
			
			System.out.println("Before "+sTC.hashCode());
		}
		
		System.out.println("After " + sTC.hashCode()); 
		return sTC;
	}
	
		
	public void consmuer () {
		
		System.out.println(" Welcome to Static design patteren" );
	}
	
	public String userName () {
		
		return "Admin";
	}
	
	 
	

}
