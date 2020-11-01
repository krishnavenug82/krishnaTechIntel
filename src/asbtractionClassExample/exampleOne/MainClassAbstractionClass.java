package asbtractionClassExample.exampleOne;

public class MainClassAbstractionClass {
	
	public static void main(String[] args)
    { 
        int resulr = new Calculate()
        {

			@Override
			int add(int a, int b) {
				// TODO Auto-generated method stub
				return a+b;
			}    
            
            
        }.add(100, 200);
        //System.out.println(resulr);
    } 

}
