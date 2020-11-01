package hashMapExample.exampleOne;

public class MainClassForOneAndTwo {
	
	public static void main(String args[]) {
		
		ClassOne varOne =  new ClassOne();
		ClassTwo varTwo =  new ClassTwo();	
		
		System.out.println(varOne.equals(varTwo));
		
		
		String varThree = new String ("Krishna");
		String varFour  = new String ("Krishna");
		//System.out.println(varThree.equals(varFour));
	}

}
