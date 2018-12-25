package com.cg.inheritance;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class TrainingTest {
	private Training publicTraining;
	private Training corporateTraining;
	@Before
	public void setUp(){
		publicTraining=new PublicTraining("JAVA", 5000,5);
		corporateTraining=new CorporateTraining("Big Data", 3500,50);
	}
	@Test
	public void costOfJavaTraining() {
		int expectedValue=25000;
		int result=publicTraining.getOrderValue();
		assertEquals(expectedValue,result);
	}
	@Test
	public void costOfBigDataTraining() {
		int expectedValue=175000;
		int result=corporateTraining.getOrderValue();
		assertEquals(expectedValue,result);
	}
	@Test
	public void displayCorporateTraining(){
		String result=corporateTraining.toString();
		assertEquals("Training [studentId=103, subject=Big Data, fees=3500]",result);
	}
	@Test
	public void displayPublicTraining(){
		String result=publicTraining.toString();
		assertEquals("Training [studentId=106, subject=JAVA, fees=5000]",result);
	}
	
}
