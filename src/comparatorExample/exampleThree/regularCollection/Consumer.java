package comparatorExample.exampleThree.regularCollection;

public class Consumer {
	
	String name;
	int empId;
	String location;
	
	Consumer(String consName, int consId, String consLoc){
		this.name = consName;
		this.empId = consId;
		this.location = consLoc;
		
	}
	
	public String toString() {
		return this.name + " "+ this.empId + ""+this.location;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}
