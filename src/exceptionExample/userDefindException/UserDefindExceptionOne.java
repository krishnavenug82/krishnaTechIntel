package exceptionExample.userDefindException;

import exceptionExample.throwExample.Loan;

public class UserDefindExceptionOne extends Throwable{
	
	UserDefindExceptionOne(String msg){
		
		super(msg);
		
		//System.out.println("Over weight is not allowed");
	}
	
	
   
}
