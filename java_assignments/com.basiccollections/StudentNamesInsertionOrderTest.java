package com.collections;

import static org.junit.Assert.*;

import java.util.LinkedHashSet;

import org.junit.Before;
import org.junit.Test;

public class StudentNamesInsertionOrderTest {
	
	@Test
	public void test() {
		LinkedHashSet<StudentNamesInsertionOrder> set=new LinkedHashSet<StudentNamesInsertionOrder>();
		set.add(new StudentNamesInsertionOrder("janu"));
		set.add(new StudentNamesInsertionOrder("jahnavi"));
		set.add(new StudentNamesInsertionOrder("siva"));
		set.add(new StudentNamesInsertionOrder("ram"));
			System.out.println(set);
			String expected="[StudentNamesInsertionOrder [name=janu],"
					+ " StudentNamesInsertionOrder [name=jahnavi],"
					+ " StudentNamesInsertionOrder [name=siva],"
					+ " StudentNamesInsertionOrder [name=ram]]";
		assertEquals(expected,set.toString());
		
	}

}
