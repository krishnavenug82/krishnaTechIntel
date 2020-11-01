package thread.dataBaseConnection;

public class MainThreadClass {

	public static void main(String args[]) {
		MultiConnection mulConn = new MultiConnection();

		Thread thr = new Thread(mulConn);
		thr.start();
				
		Thread thr1 = new Thread(mulConn);
		thr1.start();

		Thread thr2 = new Thread(mulConn);
		thr2.start();
	}

}
