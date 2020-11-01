package overLoading.staticOverLoad.exception;

import java.io.IOException;

public class B {
	
	void myMethod(int i) throws NumberFormatException
    {
        System.out.println("TWO");
    }
	
	void myMethod(int i , int j) throws ArrayIndexOutOfBoundsException
    {
        System.out.println("THREE");
    }
}
