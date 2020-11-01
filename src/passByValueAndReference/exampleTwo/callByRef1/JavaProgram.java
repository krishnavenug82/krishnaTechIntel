package passByValueAndReference.exampleTwo.callByRef1;

public class JavaProgram {
	
	public static void main(String args[])
    {
        
        Test obj = new Test(150, 200);
        
        int a = 150, b = 200;
        
        System.out.println("The value of obj.a and obj.b before call :");
        System.out.println("obj.a = " + obj.a + "\t obj.b = " + obj.b);
        
        obj.meth(obj);
        
        System.out.println("\nThe value of obj.a and obj.b after call : ");
        System.out.println("obj.a = " + obj.a + "\t obj.b = " + obj.b);
        
        Test1  test1 =  new Test1();
        System.out.println("Test holder" + test1.cardHolder());
    }

}
