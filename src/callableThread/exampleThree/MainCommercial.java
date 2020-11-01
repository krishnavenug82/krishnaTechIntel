package callableThread.exampleThree;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MainCommercial {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		// TODO Auto-generated method stub
		
		ExecutorService es = Executors.newFixedThreadPool(50);
		Commercial comm = new Commercial("Srikirishna group of company");
		Future<String> result = es.submit(comm);
		System.out.println(result.get());

	}

}
