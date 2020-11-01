package thread.exampleFour.WithOutThread;

import java.util.concurrent.TimeUnit;

import thread.exampleFour.withThread.ThreadClassForAddSubMulDiv;

public class MainAddSubMulDiv {

	public static void main(String args[]) {

		for (int i = 0; i < 5; i++) {

			AddNumber addNumber = new AddNumber();
			addNumber.addNUmber(10, 5);

			SubNumber subNumber = new SubNumber();
			subNumber.subNUmber(10, 5);

			MulNumber mulNumber = new MulNumber();
			mulNumber.mulNUmber(10, 5);

			DivNumber divNUmber = new DivNumber();
			divNUmber.divNUmber(10, 5);
			
			try {
				TimeUnit.SECONDS.sleep(20);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
	}

}
