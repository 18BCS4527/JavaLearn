package learn;
import java.time.*;
public class DateAndTime {

	public static void main(String[] args) {
		LocalDate ld= LocalDate.now();
		System.out.println(ld);
		System.out.println(ld.getDayOfWeek());
		System.out.println(ld.getDayOfMonth());
		System.out.println(ld.getYear());
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId zd=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt=ZonedDateTime.now(zd);
		System.out.println(zt);
		
	}
}
