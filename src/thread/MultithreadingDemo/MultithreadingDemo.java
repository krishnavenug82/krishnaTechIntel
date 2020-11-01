package thread.MultithreadingDemo;

import logfile.MainExampleOfLogFiles;

public class MultithreadingDemo extends Thread{
	
	MainExampleOfLogFiles logFiles = new MainExampleOfLogFiles();
	
	public void financialDetails() {
		
		logFiles.logInfoSystem("financial year 2001");
		
	}
	

}
