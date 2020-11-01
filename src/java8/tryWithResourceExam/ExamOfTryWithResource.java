package java8.tryWithResourceExam;

import java.io.FileOutputStream;

import java.lang.Math;
//import static java.lang.Math.*;


public class ExamOfTryWithResource {
	public static void main(String args[]) {
		// Using try-with-resources
		try (FileOutputStream fileOutputStream = newFileOutputStream("/java7-new-features/src/abc.txt")) {
			String msg = "Welcome to javaTpoint!";
			byte byteArray[] = msg.getBytes(); // converting string into byte array
			fileOutputStream.write(byteArray);
			System.out.println("Message written to file successfuly!");
		} catch (Exception exception) {
			System.out.println(exception);
		}
		
	  Math.sqrt(54);
		
		sqrt(55);
		
	      
	}
}
