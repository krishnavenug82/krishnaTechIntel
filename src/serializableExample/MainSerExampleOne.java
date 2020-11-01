package serializableExample;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;

public class MainSerExampleOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SerExampleOne serExam = new SerExampleOne();
		serExam.setAge(15);
		serExam.setName("Srikrishna");
		
		
		try {
			FileOutputStream outputFile = new FileOutputStream("H:\\Java_Hadoop\\serializable\\SerExampleOne.ser");
			ObjectOutputStream out = new ObjectOutputStream(outputFile);
			out.writeObject(serExam); // Object Serialization
			out.close();
			outputFile.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
