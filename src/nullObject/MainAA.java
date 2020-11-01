package nullObject;

public class MainAA {
	
	static AA vv;
	
	
	public static void main(String args[]) {
		
		int jj = 15;
		
		
		AA ab =  new AA();
		ab.interest();
		
		AA aa;
		aa =  ab;
		aa.interest();
		
		ab = vv;
		
	
		vv = new AA();		
		vv.interest();
		
		
	}

}
