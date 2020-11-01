package thread.dataBaseConnection;

public class MultiConnection implements Runnable {

	@Override
	public void run() {

		DataBaseConnectionEx datBase = new DataBaseConnectionEx();
		datBase.conumser();
		// TODO Auto-generated method stub

	}
}
