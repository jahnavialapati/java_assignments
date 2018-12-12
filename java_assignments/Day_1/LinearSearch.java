import java.util.Scanner;
class LinearSearch
{
	static int linearSearch(int array[],int number)
	{
		for(int i=0;i<15;i++)
		{
			if(array[i]==number)
			{
				return number;	
			}
			
		}
		return -1;
	}
	public static void main(String[] args)
	{
		int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int find=linearSearch(array,19);
		if(find==19)
		{
			System.out.println(+find+" found in array");
		}
		else
		{
			System.out.println(+find+" not found");
		}
	}
}