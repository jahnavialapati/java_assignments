package com.cg.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class EmployeeReader {
	public String displayEmployee(FileReader fr) throws IOException{
		String newLine ="";
		String line="";
		BufferedReader br = new BufferedReader(fr);
		while((line = br.readLine())!= null){
		newLine+=line;
		}
		return newLine;
		}
}