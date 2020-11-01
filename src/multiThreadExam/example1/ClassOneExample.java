package multiThreadExam.example1;

public class ClassOneExample implements Runnable{

	@Override
	public void run() {		
			
			for (int i = 0 ; i < 100 ; i++) {
				System.out.println(" i " + i );
			}
		
	}
	
	public void start() {		
		
		for (int j = 0 ; j < 100 ; j++) {
			System.out.println(" j " + j );
		}
	
}
	
	
	
		
	}
	
	


