package Java8.TimeApi;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.temporal.TemporalAdjusters;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.TimeZone;

public class DateAPIUtilities {

	public static void main(String[] args) {
		
		
		String year = "2018";
		String month = "03";
		String day = "28";
		
		LocalDate l = LocalDate.now();
		
		LocalDate today = LocalDate.of(Integer.valueOf(year), Integer.valueOf(month), Integer.valueOf(day));	
		
		System.out.println(today.getDayOfWeek());
		
		
		TimeZone timeZone1 = TimeZone.getTimeZone("Europe/Istanbul");
		TimeZone timeZone2 = TimeZone.getTimeZone("Europe/London");

		Calendar calendar = new GregorianCalendar();
		calendar.setTimeZone(timeZone1);
		long timeCPH = calendar.getTimeInMillis();
		System.out.println("timeCPH  = " + timeCPH);
		System.out.println("hour     = " + calendar.get(Calendar.HOUR_OF_DAY));

		calendar.setTimeZone(timeZone2);

		long timeLA = calendar.getTimeInMillis();
		System.out.println("timeLA   = " + timeLA);
		System.out.println("hour     = " + calendar.get(Calendar.HOUR_OF_DAY));
	
		
	
		
		//Get the Year, check if it's leap year
		System.out.println("Year "+today.getYear()+" is Leap Year? "+today.isLeapYear());
		
		//Compare two LocalDate for before and after
		System.out.println("Today is before 01/01/2015? "+today.isBefore(LocalDate.of(2015,1,1)));
		
		//Create LocalDateTime from LocalDate
		System.out.println("Current Time="+today.atTime(LocalTime.now()));
		
		//plus and minus operations
		System.out.println("10 days after today will be "+today.plusDays(10));
		System.out.println("3 weeks after today will be "+today.plusWeeks(3));
		System.out.println("20 months after today will be "+today.plusMonths(20));

		System.out.println("10 days before today will be "+today.minusDays(10));
		System.out.println("3 weeks before today will be "+today.minusWeeks(3));
		System.out.println("20 months before today will be "+today.minusMonths(20));
		
		//Temporal adjusters for adjusting the dates
		System.out.println("First date of this month= "+today.with(TemporalAdjusters.firstDayOfMonth()));
		LocalDate lastDayOfYear = today.with(TemporalAdjusters.lastDayOfYear());
		System.out.println("Last date of this year= "+lastDayOfYear);
		
		Period period = today.until(lastDayOfYear);
		System.out.println("Period Format= "+period);
		System.out.println("Months remaining in the year= "+period.getMonths());	
		
	
	}
}