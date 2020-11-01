package java8.lamdaExpression.comparatorExam;

public class Employee {
	
 private String name;
 private int age;
 private String city;
 
 Employee(String name, int age, String city){
	 
	 this.name = name;
	 this.age = age;
	 this.city = city;
 }
 
 @Override
	public String toString() {
		// TODO Auto-generated method stub
		return name + "" + age + "" + city;
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

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
 
 
 
 



}
