public class Palindrome 
{
	public boolean palindrome(int number)
	{
		int temporaryNumber=number;
		int reverseNumber=0;
		if(number>10)
		{
			while(number!=0)
			{
				int remainder=number%10;
				reverseNumber=reverseNumber*10+remainder;
				number=number/10;
			}
			if(reverseNumber==temporaryNumber)
				return true;
		}
		return false;
	}
}
