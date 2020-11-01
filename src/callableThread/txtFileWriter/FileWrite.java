package callableThread.txtFileWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileWrite {

	//public static void main(String[] args) {
		
		public void writeEmployeeInTxt(List<String> enterEmployeeLst) {

		BufferedWriter bw = null;
		FileWriter fw = null;

		try {

			String content = "This is the content to write into file\n";

			fw = new FileWriter("H:\\Java_Hadoop\\Pdf_Writer_Reader\\test.txt");
			for (String ite : enterEmployeeLst) {}
			bw = new BufferedWriter(fw);
			//bw.write(content);
			
			
		} catch (IOException e) {
			System.err.format("IOException: %s%n", e);
		} finally {
			try {
				if (bw != null)
					bw.close();

				if (fw != null)
					fw.close();
			} catch (IOException ex) {
				System.err.format("IOException: %s%n", ex);
			}
		}
	}
}
