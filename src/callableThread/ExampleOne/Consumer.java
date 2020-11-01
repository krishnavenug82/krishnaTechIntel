package callableThread.ExampleOne;

import java.util.List;
import java.util.concurrent.Callable;

import callableThread.dao.EmployeeThread;

public class Consumer implements Callable<List<String>> {
	List<String> userList;
	int k;
	int j;
	int id;
	String name;
	String dept;
	String location;
	String designation;
	String emil;

	// public Consumer(List<String> string, int from, int to,int id, String name,
	// String dept, String location, String designation, String emil) {
	public Consumer(List<String> string, int from, int to) {
		this.userList = string;
		this.k = to;
		this.j = from;

		// TODO Auto-generated constructor stub
	}

	@Override
	public List<String> call() throws Exception {
		// TODO Auto-generated method stub
		for (int i = j; i < k; i++) {
			userList.add("a" + i);

		}
		return userList;
	}

}
