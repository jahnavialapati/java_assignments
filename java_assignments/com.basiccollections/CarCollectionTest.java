package com.collections;

import static org.junit.Assert.*;

import java.util.TreeSet;

import org.junit.Before;
import org.junit.Test;

public class CarCollectionTest {
	
	@Test
	public void test() {
		TreeSet<Object> set=new TreeSet<Object>();
		set.add(new CarCollection("Verna","v7",1000000,2002));
		set.add(new CarCollection("Audi","A8",7000000,1996));
		set.add(new CarCollection("BMW","b3",1050000,2005));
		System.out.println(set);
		String expected="[CarCollection [make=Audi, model=A8, year=7000000, price=1996],"
				+ " CarCollection [make=BMW, model=b3, year=1050000, price=2005],"
				+ " CarCollection [make=Verna, model=v7, year=1000000, price=2002]]";
	
			System.out.println(set);
		assertEquals(expected,set.toString());
	}

}
