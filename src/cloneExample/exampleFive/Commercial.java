package cloneExample.exampleFive;

import java.io.NotActiveException;

public interface Commercial {
	
	public void consumer() ;
	
	public void producer() throws Exception ;
	
	public String request() throws Exception;

}
