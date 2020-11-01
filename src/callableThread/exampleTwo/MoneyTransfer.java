package callableThread.exampleTwo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Callable;

public class MoneyTransfer implements Callable<Set<String>>{
	
	MoneyTransfer(Set<String> typeOfMoney){
		
	}

	@Override
	public Set<String> call() throws Exception {
		// TODO Auto-generated method stub
		Set<String> userList = new HashSet<String>();
		
		for (int i = 0 ; i < 1000; i ++ ) {
			
			userList.add("a"+ i);
			
		}
		return userList;
	}

}
