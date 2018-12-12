import java.util.Scanner;
class Discount
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter a item value:");
	int newItem=sc.nextInt();
	calculatePercentage(newItem);
}
static void calculatePercentage(int newItem)
{
	float discount=newItem*(float) 0.35;
	float newItemPrice=newItem-discount;
	System.out.println(newItemPrice);
}
}