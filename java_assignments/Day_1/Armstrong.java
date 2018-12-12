import java.util.Scanner;
public class Armstrong 
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
        	int number;   
        	Scanner s = new Scanner(System.in);
        	System.out.print("Enter a number:");
        	number=s.nextInt();
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
        		System.out.print("It is armstrong number");
        	else
    	        	System.out.print("It is not armstrong number");
	}
}