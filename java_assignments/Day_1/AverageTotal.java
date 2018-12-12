import java.util.Scanner;
public class AverageTotal 
{
	public static void main(String args[])
	{
		int studentDetails[][]=new int[3][3];
		int total=0;
		Scanner sc=new Scanner(System.in);
		for(int rows=0;rows<3;rows++)
		{
			System.out.println("enter student  "+(rows+1)+"  marks in A,B and C subjects:");
			for(int columns=0;columns<3;columns++)
			{
				studentDetails[rows][columns]=sc.nextInt();
			}
		}
		for(int rows=0;rows<3;rows++)
		{
			total=0;
			for(int columns=0;columns<3;columns++)
			{
				total += studentDetails[rows][columns];
			}
			System.out.println("total score of student "+(rows+1)+" :"+total);
			System.out.println("Average score is:"+(total/3));
		}
	}
}