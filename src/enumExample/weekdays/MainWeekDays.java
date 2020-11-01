package enumExample.weekdays;

public class MainWeekDays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WeekDays firstDay = WeekDays.Sunday;
		WeekDays lastDay = WeekDays.Saturday;

		System.out.println(firstDay.compareTo(lastDay));

		System.out.println(firstDay.equals(lastDay));		
		

		WeekDaysValue valueOfWeekday = new WeekDaysValue() {

			@Override
			public int weekdaysValue() {
				WeekDays todays = null;

				WeekDays firstDay = WeekDays.Sunday;
				if (todays == firstDay) {

					return 0;

				}
				if (todays != firstDay) {
					return 1;
				}

				return -1;
			}

		};
		
		System.out.println(valueOfWeekday.weekdaysValue());

	}

}
