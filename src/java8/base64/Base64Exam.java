package java8.base64;

import com.itextpdf.text.pdf.codec.Base64;

public class Base64Exam {
	
	
	public static void test() {
		
		int end = Base64.ENCODE;
		
		String result = Base64.encodeFromFile("The java base 64 is used to convert from encode to decode ");
		
		System.out.println(end);
		
		System.out.println(result);
	}

	
	public static void main (String args[]) {
		test();
	}
}
