package datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoField;

public class Ex1 {
	public static void main(String[] args) {
		LocalDate today = LocalDate.of(2019, 11, 9);
		
//		today.with(ChronoField.DAY_OF_MONTH, 19);
		
		today = today.plusDays(10); //all except (exceptions) objects are immutable (like String)
		
		System.out.println("Today is (was) " + today);
	}

}
