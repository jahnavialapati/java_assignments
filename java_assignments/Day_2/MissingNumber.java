public class MissingNumber {
	public int missingElement(int[] numbers) 
	{
		for (int loopOne = 0; loopOne < numbers.length; loopOne++) 
		{ 
			for (int loopTwo = 0; loopTwo < numbers.length - 1; loopTwo++) 
			{
				if (numbers[loopTwo] > numbers[loopTwo + 1]) 
				{  
					int temp = numbers[loopTwo];
					numbers[loopTwo] = numbers[loopTwo + 1];
					numbers[loopTwo + 1] = temp;
				}
			}
		}
			for(int count=0;count<numbers.length;count++)
			{
				if(numbers[count]!=count)
				{
					return count;
				}
			}
		return numbers.length;
	}
}