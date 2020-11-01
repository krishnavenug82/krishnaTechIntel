package waitFunction;

import java.util.HashMap;
import java.util.Map;

public class WaitFunctionExample {

	

	public static void main(String[] args){
		// TODO Auto-generated method stub
		Consumer consumer = new Consumer();
		/*try {
			consumer.wait(20);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		consumer.consumer();
		
		Map<Integer, String > map = new HashMap<Integer, String>();
		map.put(12, "Krish");
		map.put(15, "Ram");
		map.put(25, "varalakshmi");
		 
		System.out.println(map);
		
	}

}
