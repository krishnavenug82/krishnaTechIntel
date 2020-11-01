package serializableExample;

import java.io.Serializable;

import seriallizableExam.Employer;

public class SerExampleOne extends Employer implements Serializable{
	
	private String name;
	private int age;
	
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
	
	
	

}
