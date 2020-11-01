package noClsDefFoundErr.exampleOne;

public class ClassOne {
	
	public static void main(String args[]) { 
        try 
        { 
            Class.forName("noClsDefFoundErr.exampleOne.ClassTwo"); 
        } 
        catch (ClassNotFoundException ex) 
        { 
            ex.printStackTrace(); 
        } 
    } 

}
