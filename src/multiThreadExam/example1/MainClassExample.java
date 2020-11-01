package multiThreadExam.example1;

public class MainClassExample {

	public static void main(String args[]) {

		Thread t1 = new Thread(new ClassOneExample());
		Thread t2 = new Thread(new ClassOneExample());

		synchronized (t1) {
			t1.start();
		}
		
		synchronized (t2) {
			t2.start();
		}

	} 

}
