 package staticExample.exampleOne;

public class StaticClassEaxmpleOne extends StaticClassExampleOfParetn{
	
		static int num = 100;
		static String mystr  = "Srikrishna";
		double interest = 200;
		
		
		StaticClassEaxmpleOne (){
			
			//super.interest; 
			
		} 

	public int  consumer(int g) {
		
		this.num = g;
		
		return num;
	}
}
