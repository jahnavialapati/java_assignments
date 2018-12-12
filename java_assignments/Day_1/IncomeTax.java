import java.util.Scanner;
class IncomeTax
{
	static double taxPayable(int ctc)
	{
		double taxamount=0.0,tax=0.0;
		if(ctc>=0&&ctc<=180000)
		{
			taxamount=9999.0;
		}
		else if(ctc>=181001&&ctc<=300000)
		{
			taxamount=ctc*0.1;
		}
		else if(ctc>=300001&&ctc<=500000)
		{
			taxamount=ctc*0.2;
		}
		else if(ctc>=500001&&ctc<=1000000)
		{
			taxamount=ctc*0.3;
		}
	return taxamount;	
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter your ctc:");
		int ctc=s.nextInt();
                double amount=taxPayable(ctc);
                if(amount==9999.0)
		{
			System.out.println("Nil");
		}
		else
		{
			System.out.println(amount);	
		}
			
	}
}