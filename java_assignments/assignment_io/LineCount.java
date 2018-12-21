package com.cg.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class LineCount {
	public int linesCount(String string) throws IOException{
		File f=new File(string);
		FileReader filereader=new FileReader(f);
		BufferedReader bufferedReader=new BufferedReader(filereader);
		int count=0;
		while(bufferedReader.readLine()!=null)
		{
			count++;
		}	
		System.out.println(count);
		return count;	
	}
}
