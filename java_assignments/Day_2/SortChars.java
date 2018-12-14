
public class SortChars {
     public String[] palindrome(String[] inputArray)
     {
    	int c=0;
		for(int count=0;count<inputArray.length;count++)
		{
			String temp=inputArray[count];
				
			String reverse="";
				for(int j=temp.length()-1;j>=0;j--)
				{
					
					reverse=reverse+temp.charAt(j);
				}
			    if(reverse.equals(temp))
			    {
			    	inputArray[c]=inputArray[count];
			    	c++;
			    }
		}
		String s[]=new String[c];
		for(int i=0;i<s.length;i++)
		{
			s[i]=inputArray[i];
		}
		for(int i=0;i<s.length-1;i++)
		{
			for(int j=i+1;j<s.length-1;j++)
			{
					if(s[i].length()>s[j].length())
					{
						String temp=s[i];
						s[i]=s[j];
						s[j]=temp;
					}
					/*else if(s[i].length()=s[j].length())
					{
						s[i].charAt(i)
					}*/
			}
		}
		return s;
     }
}