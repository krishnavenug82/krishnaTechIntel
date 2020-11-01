package casting;

public class CastingMainAB {
	
	public static void main(String args[]) {
		
		A aaa = new B();
		aaa.add(10, 20);
		aaa.add(10, 10, 10);
		
		 
		B bbb = (B) aaa;
		bbb.add(1, 1, 1);
		bbb.add(1, 1);
		bbb.sum(11, 11);
		
		
	}

}
