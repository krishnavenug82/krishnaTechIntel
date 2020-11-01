package thread.exampleFour.withThread;

public class MainAddSubMulDiv {

	public static void main(String args[]) {

		for (int i = 0; i < 5; i++) {

			Thread thread = new Thread(new ThreadClassForAddSubMulDiv());
			thread.start();
			try {
				//thread.sleep(50000);
				thread.sleep(10000, 1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}
