import java.util.*;
class CuiApplication
{
	public static void main(String[] args)
	{
		String userid="jahnavi";
		String password="janu@123";
		int counter = 0;
		Scanner sc = new Scanner(System.in);
		for(int count=0;count<3;count++)
		{
		System.out.println("Enter the userid : ");
		String enteruserid=sc.next();
		System.out.println("Enter the password : ");
		String enterpassword=sc.next();
		if(userid.equals(enteruserid) && password.equals(enterpassword))
		{
			System.out.println("Welcome " +  userid);
			break;
		}
		else
		{
			counter++;
		}	
		}
		if(counter==3)
		{
			System.out.println("Contact admin");
		}
	}
}