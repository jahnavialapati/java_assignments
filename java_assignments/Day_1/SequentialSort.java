class SequentialSort
{	
public static void main(String[] args) throws Exception
	{
		int array[] = {5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
		int temporaryNumber;
		for(int number=0;number<15;number++)
		{
			for(int count=number+1;count<15;count++)
			{
				if(array[number]>array[count])
				{
				temporaryNumber=array[number];
				array[number]=array[count];
				array[count]=temporaryNumber;
				}
			}
		}
		for(int count=0;count<15;count++)
		{
		System.out.print(array[count]+" ");
		}
	}
}