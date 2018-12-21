package com.cg.file;
	
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
	 
	class WordCount {
		public int wordCount(String string) throws IOException{
			FileReader fr = new FileReader(string);
			BufferedReader bufferReader = new BufferedReader(fr);
			String line = "";
			String sentence = "";
			int count = 0;
			int countOne = 0;
			while ((line = bufferReader.readLine()) != null) {
				sentence += line + " ";
				count++;
			}
			System.out.println("Totally " + count + " lines");
			System.out.println(sentence);
			StringTokenizer st = new StringTokenizer(sentence);
			while (st.hasMoreTokens()) {
				String s = st.nextToken();
				countOne++;
			}
			System.out.println("File has " + countOne + " words are in the file");
			return countOne;
		}
	 
	}