package com.collections;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Test;

public class StudentNamesNaturalOrderTest {

	@Test
	public void test() {
		TreeSet<Object> set=new TreeSet<Object>();
		set.add(new StudentNamesNaturalOrder("janu"));
		set.add(new StudentNamesNaturalOrder("jahnavi"));
		set.add(new StudentNamesNaturalOrder("siva"));
		set.add(new StudentNamesNaturalOrder("ram"));
		String expected="[StudentNamesNaturalOrder [name=jahnavi],"
				+ " StudentNamesNaturalOrder [name=janu],"
				+ " StudentNamesNaturalOrder [name=ram],"
				+ " StudentNamesNaturalOrder [name=siva]]";
	
			System.out.println(set);
		assertEquals(expected,set.toString());
		
	}

}
