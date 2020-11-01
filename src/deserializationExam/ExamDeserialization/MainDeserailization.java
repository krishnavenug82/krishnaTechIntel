package deserializationExam.ExamDeserialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import anonymousClsExam.Employer;
import serializableExample.SerExampleOne;



public class MainDeserailization {
	
public static void main (String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
	ObjectInputStream in = null;
	
	try {
		in= new ObjectInputStream(new FileInputStream("H:\\Java_Hadoop\\serializable\\SerExampleOne.ser"));  
		SerExampleOne s = (SerExampleOne) in.readObject();
		 System.out.println(s.getAge() +  "/n "+ s.getName()); 
		 Employer ex = new Employer();
	} catch (FileNotFoundException er ) {
		er.printStackTrace();
	} catch (NullPointerException cc ) {
	   cc.printStackTrace();
	} finally {
		 in.close();
	}
	
	
}
}
