package com.cg.file;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class WordCountTest {
	private WordCount wordsCount;
	@Before
	public void setUp()
	{
		wordsCount=new WordCount();
	}
	@Test
	public void test() {
		try{
			int result= wordsCount.wordCount("C:\\Users\\jalapati\\Documents\\linecount.txt");
			assertEquals(13,result);
		}catch(IOException e){
			e.printStackTrace();
		}
	}

}
