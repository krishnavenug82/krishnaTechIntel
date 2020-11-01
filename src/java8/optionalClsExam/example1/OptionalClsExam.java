package java8.optionalClsExam.example1;

import java.util.Optional;

import java8.optionalClsExam.exampleTwo.Student;

public class OptionalClsExam {

	public static void main(String args[]) {

		String[] name = { "Srikrisna", "Sriram", "Shiva", "Bharama", "Lakshmi", "Shakthi", "Vani" };
		String[] str = new String[10];
		String str3 = name[0].replaceAll("i", "ee");
		// String str2 = str[9].substring(1);
		System.out.println(str3);
	

	
	String s1 = "Srimadha2";
	String s2 = "Srimadha9";
	String s3 = new String("Srimadha2");
	String s4 = new String("Srimadha2");
	
	Integer i1 = new Integer(11);
	Integer i2 = new Integer(i1);
			

	if(s1==s2)
	{
		System.out.println("s1 == s2"+s1 == s2); 
	}else if(s2==s3)
	{
		System.out.println("s2 == s3 " + s2 == s3);
	}

	System.out.println(s1.hashCode());
	System.out.println(s2.hashCode());
	System.out.println(s3.hashCode());
	System.out.println(s4.hashCode());
	System.out.println(" "+i1.hashCode());
	System.out.println(i2.hashCode());
	

}

}
