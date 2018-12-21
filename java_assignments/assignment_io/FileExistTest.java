package com.cg.file;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FileExistTest {
	FileExist file;
	@Before
	public void setUp()
	{
		file=new FileExist();
	}
	@Test
	public void test() {
		boolean result=file.foundOrNot("C:\\Users\\jalapati\\Desktop\\MARKS.pdf");
		assertEquals(true,result);
	}

}
