import java.text.ParseException;
import java.time.LocalDate;
import java.time.Period;

public class differenceBetweenDates {

	public static void main(String[] args) throws ParseException {
		
		LocalDate start_date = LocalDate.of(2021, 04, 22);
		LocalDate end_date = LocalDate.of(2022, 05, 29);
		Period diff = Period.between(start_date, end_date);
		System.out.printf("%d years, %d months, %d days", diff.getYears(), diff.getMonths(), diff.getDays());
		
	}
}
