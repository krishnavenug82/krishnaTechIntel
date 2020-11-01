package callableThread.exampleTwo;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainMoneyTransfer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ExecutorService executor = Executors.newFixedThreadPool(10);
		 Set<String> moneyTrans = new HashSet<String>();		 
		 MoneyTransfer mt = new MoneyTransfer(moneyTrans);
		 
		 Future<Set<String>> result = executor.submit(mt);
		 

	}

}
