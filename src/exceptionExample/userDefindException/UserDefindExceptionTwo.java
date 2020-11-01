package exceptionExample.userDefindException;

public class UserDefindExceptionTwo {
	
	public void productCheck(int weightOfTheProduct) throws UserDefindExceptionOne{
		
		if(weightOfTheProduct < 200) {
			
			throw new UserDefindExceptionOne("over weight");
			
		}
		
	}

}
