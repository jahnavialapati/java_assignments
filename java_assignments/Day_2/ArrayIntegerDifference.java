public class ArrayIntegerDifference 
{
	public int findDifference(int[] numbers, int k) 
	{
		for(int count=0;count<numbers.length;count++)
		{
			for(int counter=count;counter<numbers.length;counter++)
			{
 				if(count!=counter)
 				{
					if(numbers[count]==numbers[counter])
					{
						int difference=Math.abs(count-counter);
						return difference;
					}
				}
			}
		}
		return -1;
	}
}
