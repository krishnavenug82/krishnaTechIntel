package reflection.exampleOne;

public class Test {
	public static void main(String args[]) throws ReflectiveOperationException{  
		/*  Class<?> c =Class.forName("Simple");  
		  System.out.println(c.getName());  */
		  
		  Class<Simple> cls = Simple.class;		 
		 
		  Simple simple = new Simple();
		  simple.setName("SriRadhaKrishna");
		  
		  System.out.println( cls.getName()+ "\n" + simple.getName());
		  
		 }  

}
