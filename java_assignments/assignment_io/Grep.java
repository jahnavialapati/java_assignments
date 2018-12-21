package com.cg.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Grep {
	public String findingString(String string,String word) throws IOException{
		FileReader fileReader=new FileReader(string);
		BufferedReader bufferReader=new BufferedReader(fileReader);
		String line="";
		String newLine="";
		int count=0;
		while((line = bufferReader.readLine())!= null)
		{
				count++;
				
				String[] splitWord=line.split(" ");
				for(int i=0;i<splitWord.length;i++)
				{
					if(splitWord[i].equals(word))
					{
						newLine+=count+" "+line+"\n";
						
					}
						
				}
		}
		System.out.println(newLine);
		return newLine;
	}
}
