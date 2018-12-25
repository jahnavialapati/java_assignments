package com.cg.file;

import static org.junit.Assert.*;


import java.io.FileReader;

import java.io.IOException;



import org.junit.Before;

import org.junit.Test;

public class EmployeeReaderTest {
	private  EmployeeReader employeeReader;
	@Before
	public void setUp(){
		employeeReader = new EmployeeReader();
	}

	@Test
	public void writerTest() throws IOException{
		FileReader fileWriter = new FileReader("C:\\Users\\jalapati\\Documents\\myclass.txt");
		String actual = employeeReader.displayEmployee(fileWriter);
		String expected = "Employee [id=501, Name=jahnavi, salary=15000.0]";
		assertEquals(expected,actual);
	}
}
