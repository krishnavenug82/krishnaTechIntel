package thread.exampleThree.multiThread;

public class Count implements Runnable{
	
	Thread mythread ;
	   Count()
	   { 
	      mythread = new Thread(this, "my runnable thread");
	      System.out.println("my thread created" + mythread);
	      mythread.start();
	   }

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try
	      {
	        for (int i=0 ;i<10;i++)
	        {
	          System.out.println("Printing the count " + i);
	          Thread.sleep(1000);
	        }
	     }
	     catch(InterruptedException e)
	     {
	        System.out.println("my thread interrupted");
	     }
	     System.out.println("mythread run is over" );
		
	}

}
