package scriptfp;

public class ScriptfpExampl {
	
	public static strictfp double sum()   {
		
		int data=10;
        double num1 = 10e+10; 
  
        double num2 = 6e+08; 
  
        return (num1+num2); 
  
    } 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Double result = sum();
		System.out.println(result);

	}

}
