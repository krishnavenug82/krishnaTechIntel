package callableThread.dao;

public class EmployeePersonlDetails {

	private int id;
	private String name;
	private String dept;
	private String location;
	private String desig;
	private String email;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDesig() {
		return desig;
	}

	public void setDesig(String desig) {
		this.desig = desig;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Id : " + this.getId() + ", Name : " + this.getName() + ", Dept : " + this.getDept() + ", Location : "
				+ this.getLocation() + ", Designation : " + this.getDesig() + ", Email : " + this.getEmail();

	}

}
