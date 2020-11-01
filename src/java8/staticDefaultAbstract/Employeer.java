package java8.staticDefaultAbstract;

public interface Employeer {
	
	public String consumer();
	
	static String commercial() {
		return null;
		
	}
	
	default String client() {
		return null;
		
	}

}
