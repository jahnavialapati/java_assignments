import java.util.Scanner;
public class Marks
{
	static int result(int subject1,int subject2,int subject3)
	{
                int value=0;
		if(subject1>60&&subject2>60&&subject3>60)
		{
			value=1;
		}
		else if(subject1>60&&subject2>60||subject1>60&&subject3>60||subject3>60&&subject2>60)
		{
			value=2;
		}
		else if(subject1>60||subject2>60||subject3>60)
		{
			value=3;
		}
		return value;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter first subject:");
		int subject1=s.nextInt();
		System.out.println("enter second subject:");
		int subject2=s.nextInt();
		System.out.println("enter third subject:");
		int subject3=s.nextInt();
		int grade=result(subject1,subject2,subject3);
		if(grade==1)
		{
			System.out.println("Passed");
		}
		else if(grade==2)
		{
			System.out.println("Promoted");
		}
		else if(grade==3)
		{
			System.out.println("failed");
		}
     
	}
}