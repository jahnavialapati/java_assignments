package com.cg.datetime;

import static org.junit.Assert.*;

import java.time.LocalDate;

import java.time.Month;

import org.junit.Test;

public class DaysAliveTest {
	private DaysAlive days;
	@Test
	public void daysAlivetest() {
		days=new DaysAlive();
		LocalDate dateBefore = LocalDate.of(2000, Month.JANUARY, 1);
		long numberOfDays=days.daysAlive(dateBefore);
		assertEquals(6934,numberOfDays);
	}
}