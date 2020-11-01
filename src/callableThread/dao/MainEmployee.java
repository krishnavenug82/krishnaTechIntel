package callableThread.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfDocument;
import callableThread.pdfReader.PdfFileWriter;
import callableThread.txtFileWriter.FileWrite;
import callableThread.txtFileWriter.FileWriterExample2;



public class MainEmployee {
	private static final String FILE_NAME = "/tmp/itext.pdf";
	PdfDocument doc = new PdfDocument();	
	Document docc = new Document();
	String variable;
	static FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
	
	
	public static void main(String args[]) throws InterruptedException, ExecutionException {

		// Set no of thread
		ExecutorService executor = Executors.newFixedThreadPool(50);

		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
		Date now = new Date();
		String strDate = sdf.format(now);

		EmployeeThread emp = new EmployeeThread(1, 1100000);
		Future<List<EmployeePersonlDetails>> employeeFuture = executor.submit(emp);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest.txt");

		/*EmployeeThread emp1 = new EmployeeThread(100001, 200000);
		Future<List<EmployeePersonlDetails>> employeeFuture1 = executor.submit(emp1);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture1, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest1.txt");

		EmployeeThread emp2 = new EmployeeThread(200001, 300000);
		Future<List<EmployeePersonlDetails>> employeeFuture2 = executor.submit(emp2);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture2, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest2.txt");

		EmployeeThread emp3 = new EmployeeThread(300001, 400000);
		Future<List<EmployeePersonlDetails>> employeeFuture3 = executor.submit(emp3);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture3, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest3.txt");

		EmployeeThread emp4 = new EmployeeThread(400001, 500000);
		Future<List<EmployeePersonlDetails>> employeeFuture4 = executor.submit(emp4);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture4, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest4.txt");

		EmployeeThread emp5 = new EmployeeThread(500001, 600000);
		Future<List<EmployeePersonlDetails>> employeeFuture5 = executor.submit(emp5);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture5, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest5.txt");

		EmployeeThread emp6 = new EmployeeThread(600001, 700000);
		Future<List<EmployeePersonlDetails>> employeeFuture6 = executor.submit(emp6);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture6, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest6.txt");

		EmployeeThread emp7 = new EmployeeThread(700001, 800000);
		Future<List<EmployeePersonlDetails>> employeeFuture7 = executor.submit(emp7);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture7, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest7.txt");

		EmployeeThread emp8 = new EmployeeThread(800001, 900000);
		Future<List<EmployeePersonlDetails>> employeeFuture8 = executor.submit(emp8);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture8, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest8.txt");

		EmployeeThread emp9 = new EmployeeThread(900001, 1000000);
		Future<List<EmployeePersonlDetails>> employeeFuture9 = executor.submit(emp9);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture9, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest9.txt");

		EmployeeThread emp10 = new EmployeeThread(1000001, 1100000);
		Future<List<EmployeePersonlDetails>> employeeFuture10 = executor.submit(emp10);
		writeEmployeeLst.useByfferedFileWriter(employeeFuture10, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest10.txt");
		*/
				
		/*for (EmployeePersonlDetails iterationForThread : employeeFuture.get()) {
			
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest.txt");
			
			
			PdfFileWriter writeEmployeePdf = new PdfFileWriter();
			writeEmployeePdf.writeUsingIText("Id : " + iterationForThread.getId() + ", Name : " + iterationForThread.getName()
			+ ", Dept : " + iterationForThread.getDept() + ", Designation : " + iterationForThread.getDesig()
			+ ", Location : " + iterationForThread.getLocation() + ", Email: " + iterationForThread.getEmail());

			System.out.println("Id : " + iterationForThread.getId() + ", Name : " + iterationForThread.getName()
					+ ", Dept : " + iterationForThread.getDept() + ", Designation : " + iterationForThread.getDesig()
					+ ", Location : " + iterationForThread.getLocation() + ", Email: " + iterationForThread.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread1 : employeeFuture1.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture1, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest1.txt");

			System.out.println("Id : " + iterationForThread1.getId() + "Name : " + iterationForThread1.getName()
					+ "Dept : " + iterationForThread1.getDept() + " Designation : " + iterationForThread1.getDesig()
					+ " Location : " + iterationForThread1.getLocation() + " Email: " + iterationForThread1.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread2 : employeeFuture2.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture2, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest2.txt");

			System.out.println("Id : " + iterationForThread2.getId() + "Name : " + iterationForThread2.getName()
					+ "Dept : " + iterationForThread2.getDept() + " Designation : " + iterationForThread2.getDesig()
					+ " Location : " + iterationForThread2.getLocation() + " Email: " + iterationForThread2.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread3 : employeeFuture3.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture3, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest3.txt");

			System.out.println("Id : " + iterationForThread3.getId() + "Name : " + iterationForThread3.getName()
					+ "Dept : " + iterationForThread3.getDept() + " Designation : " + iterationForThread3.getDesig()
					+ " Location : " + iterationForThread3.getLocation() + " Email: " + iterationForThread3.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread4 : employeeFuture4.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture4, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest4.txt");

			System.out.println("Id : " + iterationForThread4.getId() + "Name : " + iterationForThread4.getName()
					+ "Dept : " + iterationForThread4.getDept() + " Designation : " + iterationForThread4.getDesig()
					+ " Location : " + iterationForThread4.getLocation() + " Email: " + iterationForThread4.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread5 : employeeFuture5.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture5, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest5.txt");

			System.out.println("Id : " + iterationForThread5.getId() + "Name : " + iterationForThread5.getName()
					+ "Dept : " + iterationForThread5.getDept() + " Designation : " + iterationForThread5.getDesig()
					+ " Location : " + iterationForThread5.getLocation() + " Email: " + iterationForThread5.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread6 : employeeFuture6.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture6, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest6.txt");

			System.out.println("Id : " + iterationForThread6.getId() + "Name : " + iterationForThread6.getName()
					+ "Dept : " + iterationForThread6.getDept() + " Designation : " + iterationForThread6.getDesig()
					+ " Location : " + iterationForThread6.getLocation() + " Email: " + iterationForThread6.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread7 : employeeFuture7.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture7, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest7.txt");

			System.out.println("Id : " + iterationForThread7.getId() + "Name : " + iterationForThread7.getName()
					+ "Dept : " + iterationForThread7.getDept() + " Designation : " + iterationForThread7.getDesig()
					+ " Location : " + iterationForThread7.getLocation() + " Email: " + iterationForThread7.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread8 : employeeFuture8.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture8, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest8.txt");

			System.out.println("Id : " + iterationForThread8.getId() + "Name : " + iterationForThread8.getName()
					+ "Dept : " + iterationForThread8.getDept() + " Designation : " + iterationForThread8.getDesig()
					+ " Location : " + iterationForThread8.getLocation() + " Email: " + iterationForThread8.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread9 : employeeFuture9.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture9, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest9.txt");

			System.out.println("Id : " + iterationForThread9.getId() + "Name : " + iterationForThread9.getName()
					+ "Dept : " + iterationForThread9.getDept() + " Designation : " + iterationForThread9.getDesig()
					+ " Location : " + iterationForThread9.getLocation() + " Email: " + iterationForThread9.getEmail());

		}

		for (EmployeePersonlDetails iterationForThread10 : employeeFuture10.get()) {
			FileWriterExample2 writeEmployeeLst = new FileWriterExample2();
			writeEmployeeLst.useByfferedFileWriter(employeeFuture10, "H:\\Java_Hadoop\\Pdf_Writer_Reader\\testtest10.txt");

			System.out.println("Id : " + iterationForThread10.getId() + "Name : " + iterationForThread10.getName()
					+ "Dept : " + iterationForThread10.getDept() + " Designation : " + iterationForThread10.getDesig()
					+ " Location : " + iterationForThread10.getLocation() + " Email: " + iterationForThread10.getEmail());
			}*/

		System.out.println("S date " + strDate);
		Date now1 = new Date();
		String endDate = sdf.format(now1);
		System.out.println("E date " + endDate);

		executor.shutdown();

	}
}
