package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculosComDatas {

	public static void main(String[] args) {
		LocalDate d01 = LocalDate.parse("2022-07-20");
		LocalDateTime d02 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d03 = Instant.parse("2022-07-20T01:30:26Z");

		LocalDate pastWeekLocalDate = d01.minusDays(7);
		LocalDate nextWeekLocalDate = d01.plusDays(7);
		
		System.out.println("pastWeekLocalDate: "+pastWeekLocalDate);
		System.out.println("nextWeekLocalDate: "+nextWeekLocalDate);
		
		LocalDateTime pastWeekLocalDateTime = d02.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d02.plusDays(7);
	
		System.out.println("pastWeekLocalDateTime: "+pastWeekLocalDateTime);
		System.out.println("nextWeekLocalDateTime: "+nextWeekLocalDateTime);
	
		Instant pastWeekLocalInstant = d03.minus(7, ChronoUnit.DAYS);
		Instant nextWeekLocalInstant = d03.plus(7, ChronoUnit.DAYS);
		
		System.out.println("pastWeekLocalInstant: "+pastWeekLocalInstant);
		System.out.println("nextWeekLocalInstant: "+nextWeekLocalInstant);
		
		Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d01.atStartOfDay());
		System.out.println("Duration: "+ t1.toDays());
		
		
		Duration t2 = Duration.between(pastWeekLocalDateTime, d02);
		System.out.println("Duration: "+ t2.toDays());
		
		Duration t3 = Duration.between(pastWeekLocalInstant, d03);
		System.out.println("Duration: "+ t3.toDays());
		
		
	}

}
