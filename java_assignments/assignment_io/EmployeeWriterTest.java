package com.cg.file;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.FileWriter;

import java.io.IOException;



import org.junit.Before;

import org.junit.Test;

public class EmployeeWriterTest{
	private  EmployeeWriter employee;
	@Before
	public void setUp(){
		employee = new EmployeeWriter(501,"jahnavi",15000);
	}

	@Test
	public void writerTest() throws IOException{
		String details = employee.toString();
		FileWriter fileWriter = new FileWriter("C:\\Users\\jalapati\\Documents\\myclass.txt");
		fileWriter.write(details);
		fileWriter.close();
	}
}
