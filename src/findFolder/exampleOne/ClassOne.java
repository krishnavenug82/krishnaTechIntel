package findFolder.exampleOne;

import java.io.File;

public class ClassOne {

	public static void main(String arg[]) {
		File file = new File("H:\\Java_Hadoop\\fileCheckInFolder");

		if (file.isDirectory()) {

			//if (file.list().length > 0) {
			if(file.exists()) {

				System.out.println("Directory is not empty!");

			} else {

				System.out.println("Directory is empty!");

			}

		} else {

			System.out.println("This is not a directory");

		}
	}

}
