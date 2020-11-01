package java8.TimeApiEx;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeApiExample {
	
	
	
	LocalDate dateee;
	static LocalTime timeee;
	static LocalDateTime datetimee;

	
	public static void dateTimeToday() {
		System.out.println(LocalDateTime.now());
	}
	
	public static LocalDateTime dateTimeToday2() {
		return LocalDateTime.now();
	}
	
	public static void main(String args[]) {
		
		System.out.println(dateTimeToday2());
		
		timeee = LocalTime.NOON;
		System.out.println(timeee);
		
		datetimee = LocalDateTime.of(2000, 12, 20, 12, 59, 13);
		System.out.println(datetimee);
	}
}
