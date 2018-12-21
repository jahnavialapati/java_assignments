package com.cg.file;

import static org.junit.Assert.*;

import java.io.FileReader;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;

public class GrepTest {
	private Grep grep;
	@Test
	public void test() throws IOException {
		grep=new Grep();
	    grep.findingString("C:\\Users\\jalapati\\Documents\\linecount.txt","file");
		
	}
	
}
