package callableThread.ExampleOne;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainClassForConsumer {

	public static void main(String args[]) throws InterruptedException, ExecutionException {

		// Set no of thread
		ExecutorService executor = Executors.newFixedThreadPool(10);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);

		List<String> list = new ArrayList<String>();
		Consumer cons = new Consumer(list, 0, 9999);
		Future<List<String>> future = executor.submit(cons);
				
		List<String> list1 = new ArrayList<String>();
		Consumer cons1 = new Consumer(list1, 10000, 19999);
		Future<List<String>> future1 = executor.submit(cons1);
		
		List<String> list2 = new ArrayList<String>();
		Consumer cons2 = new Consumer(list2, 20000, 29999);
		Future<List<String>> future2 = executor.submit(cons2);
		
		List<String> list3 = new ArrayList<String>();
		Consumer cons3 = new Consumer(list3, 30000, 39999);
		Future<List<String>> future3 = executor.submit(cons3);
				
		
		for (String ite : future.get()) {
			System.out.println(ite + " 0 ");
		}

		for (String ite : future1.get()) {
			System.out.println(ite + " 1 ");
		}

		for (String ite : future2.get()) {
			System.out.println(ite + " 2 ");
		}

		for (String ite : future3.get()) {
			System.out.println(ite + " 3 ");
		}

		System.out.println("S date " + strDate);
		Date now1 = new Date();
		String endDate = sdf.format(now1);
		System.out.println("E date " + endDate);

		executor.shutdown();

	}
}
