package exceptionExample.throwExample;


import java.sql.SQLException;

public class throwExampleOne extends Throwable{

	static void validate(int age) throws SQLException {		
		
		if (age < 18) {}			
		else
			System.out.println("welcome to vote");
	}

	static void consumer(int age) {
		System.out.println("Consumer name is : " + age);
	}

	public static void main(String args[]) {
		consumer(15);
		try {
			validate(21);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("rest of the code...");
	}

}
