import java.util.Scanner;
public class ArmstrongRange 
{
	static int armstrongNumber(int number1,int count)
	{
       		int sum=0;
        	while(number1!=0)
        	{
        		int remainder=number1%10;
        		number1=number1/10;
        		int multiply=1;
                	for(int i=0;i<count;i++)
                	{
            			multiply=multiply*remainder;
                	}
        		sum=sum+multiply;  	
        	}
		return sum;
        }
	public static void main(String[] args)
	{
		for(int number=100;number<=999;number++)
		{ 
        		int number1=number;
        		int countNumber=number;
			int count=0;
        		while(countNumber!=0)
        		{
        			countNumber=countNumber/10;
        			count++;
        		}
        	        int sum=armstrongNumber(number1,count);
        		if(sum==number)
        			System.out.println(number);        		
		}
	}
}

