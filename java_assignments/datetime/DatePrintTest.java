package com.cg.datetime;

import static org.junit.Assert.*;
import org.junit.Test;
public class DatePrintTest {
private DatePrint date;
	@Test
	public void test() {
		date=new DatePrint();
		assertEquals("25/12/2018\n25 December, 2018",date.isString("25122018"));
	}
}