package passByValueAndReference.exampleTwo.callByRef1;

public class Test {
	
	 int a, b;
	    
	    Test(int i, int j)
	    {
	        a = i;
	        b = j;
	    }
	    
	    /* pass an object */
	    void meth(Test o)
	    {
	        o.a = o.a * 2;
	        o.b = o.b / 2;
	    }

}
