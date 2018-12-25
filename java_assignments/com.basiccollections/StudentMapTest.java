package com.collections;

import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Before;
import org.junit.Test;

public class StudentMapTest {

	@Test
	public void test() {
		HashMap<String, String> map=new HashMap<String, String>();
		map.put("jahnavi","apple");
		map.put("ram","banana");
		map.put("siva","strawberry");
		map.put("janu","orange");
		
		if(map.containsKey("jahnavi"))
		{
			String fruit=map.get("jahnavi");
			System.out.println("favourite fruit for jahnavi is: "+fruit);
		}
		if(map.containsKey("siva"))
		{
			String fruit=map.get("siva");
			System.out.println("favourite fruit for siva is: "+fruit);
		}
		
		String expected="{jahnavi=apple, siva=strawberry, ram=banana, janu=orange}";
		assertEquals(expected,map.toString());
		
	}

}
