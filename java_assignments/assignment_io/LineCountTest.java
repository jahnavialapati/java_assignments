package com.cg.file;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class LineCountTest {
	LineCount lineCount;
	@Before
	public void setUp(){
	lineCount=new LineCount();
	}
	@Test
	public void test() {
		try{
			int result= lineCount.linesCount("C:\\Users\\jalapati\\Documents\\linecount.txt");
			assertEquals(3,result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
