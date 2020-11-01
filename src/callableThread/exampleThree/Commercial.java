package callableThread.exampleThree;

import java.util.concurrent.Callable;

public class Commercial implements Callable<String>{
	String name;
	
	Commercial(String companyName){
		this.name = companyName;
		
	}

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		return name;
	}

}
