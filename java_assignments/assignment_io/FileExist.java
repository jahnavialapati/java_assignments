package com.cg.file;

import java.io.File;

public class FileExist {
	public boolean foundOrNot(String string){
	File f=new File(string);
	System.out.println(f.exists());
	boolean result= f.exists();
	return result;
	}

}
