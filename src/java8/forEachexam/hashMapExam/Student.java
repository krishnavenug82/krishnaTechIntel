package java8.forEachexam.hashMapExam;

import java.util.HashMap;
import java.util.Map;

public class Student {

	public Map<String, Integer> student() {
		Map<String, Integer> student = new HashMap<String, Integer>();
		student.put("Srikrishna", 255);
		student.put("Sriradha", 125);
		student.put("Ram", 4524);
		student.put("Seetha", 782);
		return student;

	}
}
