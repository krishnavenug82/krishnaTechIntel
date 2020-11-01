package thread.threadExampleThree;

public class MainThreadClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread thr	= new Thread(new TClassOne());
				
		
		try {
			thr.sleep(20000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thr.start();
		
		/*Thread thre	= new Thread(new TClassTwo());
		thre.start();*/

	}

}
