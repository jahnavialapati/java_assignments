package com.cg.datetime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DaysAlive {
	public long daysAlive(LocalDate dateBefore) {
		LocalDate today = LocalDate.now();
		long noOfDaysBetween = ChronoUnit.DAYS.between(dateBefore, today);
		return noOfDaysBetween;
	}
}