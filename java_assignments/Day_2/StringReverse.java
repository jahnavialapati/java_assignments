public class StringReverse {
	public String change(String string) 
	{
		char character[]=string.toCharArray();
		String reverseString="";
		int counter=0;
		for(counter=0;counter<character.length;counter++)
		{
			int temporaryNumber=counter;
			while(counter<character.length && character[counter]!=' ')
			{
				counter++;
			}
			int readchar=counter-1;
			while(readchar>=temporaryNumber)
			{
				reverseString=reverseString+character[readchar];
				readchar--;
			}
	    	if(counter<character.length)
		   {
	    		reverseString=reverseString+character[counter];
		   }

		}
		return reverseString;
	}
}






