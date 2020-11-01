package shallowCopyExam;

public class Contact {

	private long phoneNo;
	private String email;
	private String address;

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	Contact(long phoneNo, String email, String address) {
		this.phoneNo = phoneNo;
		this.email = email;
		this.address = address;
	}

	public void displayContact() {
		System.out.println("Phone no: " + this.phoneNo);
		System.out.println("Email: " + this.email);
		System.out.println("Address: " + this.address);
	}

}
