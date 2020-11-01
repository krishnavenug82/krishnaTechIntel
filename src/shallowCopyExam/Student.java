package shallowCopyExam;

import java.util.Scanner;

public class Student implements Cloneable {

	private String name;
	private int age;
	private Contact contact;

	public Student(String name, int age, Contact contact) {
		this.name = name;
		this.age = age;
		this.contact = contact;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public void displayData() {
		System.out.println("Name : " + this.name);
		System.out.println("Age : " + this.age);
		contact.displayContact();
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name ");
		String name = sc.next();
		System.out.println("Enter your age ");
		int age = sc.nextInt();
		System.out.println("#############Contact details#############");
		System.out.println("Enter your phone number: ");
		long phoneNo = sc.nextLong();
		System.out.println("Enter your Email ID: ");
		String email = sc.next();
		System.out.println("Enter your address: ");
		String address = sc.next();
		System.out.println(" ");
		// Creating an object of the class
		Student std = new Student(name, age, new Contact(phoneNo, email, address));
		// Creating a clone of the above object
		Student copiedStd = (Student) std.clone();
		// Modifying the data of the contact object
		copiedStd.contact.setPhoneNo(000000000);
		copiedStd.contact.setEmail("XXXXXXXXXX");
		copiedStd.contact.setAddress("XXXXXXXXXX");
		System.out.println("Contents of the copied object::");
		copiedStd.displayData();
		System.out.println(" ");
		System.out.println("Contents of the original object::");
		std.displayData();

	}

}
