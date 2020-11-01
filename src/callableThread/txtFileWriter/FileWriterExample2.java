package callableThread.txtFileWriter;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

import callableThread.dao.EmployeePersonlDetails;

public class FileWriterExample2 {

	public void useByfferedFileWriter(Future<List<EmployeePersonlDetails>> content, String filePath)
			throws InterruptedException, ExecutionException {

		File file = new File(filePath);
		Writer fileWriter = null;
		BufferedWriter bufferedWriter = null;

		try {

			fileWriter = new FileWriter(file);
			bufferedWriter = new BufferedWriter(fileWriter);

			// Write the lines one by one
			for (EmployeePersonlDetails line : content.get()) {
				// line += System.getProperty("line.separator");
				bufferedWriter.write(line.toString());
				bufferedWriter.newLine();
			}

		} catch (IOException e) {
			System.err.println("Error writing the file : ");
			e.printStackTrace();
		} finally {

			if (bufferedWriter != null && fileWriter != null) {
				try {
					bufferedWriter.close();
					fileWriter.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	}

}
