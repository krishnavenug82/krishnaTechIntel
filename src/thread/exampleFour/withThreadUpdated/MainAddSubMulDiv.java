package thread.exampleFour.withThreadUpdated;

import currentTime.PresentTime;

public class MainAddSubMulDiv {

	public static void main(String args[]) {

		System.out.println(new PresentTime().getPresentTime());

		for (int i = 0; i < 5; i++) {

			Thread threadAdd = new Thread(new ThreadClassForAdd(), "Add -" + i);
			threadAdd.start();

			Thread threadSub = new Thread(new ThreadClassForSub(), "Sub -" + i);
			threadSub.start();

			Thread threadMul = new Thread(new ThreadClassForMul(), "Mul -" + i);
			threadMul.start();

			Thread threadDiv = new Thread(new ThreadClassForDiv(), "Div -" + i);
			threadDiv.start();

		}
		
		System.out.println(new PresentTime().getPresentTime() );

	}

}
