public class CheckNumberMultiDimensional {
	public boolean checkNumber(int number)
	{
		int elementArray[][]={{1,2,3},{4,5,6},{7,8,9}};
		for(int row=0;row<elementArray.length;row++)
		{
			for(int column=0;column<elementArray[row].length;column++)
			{
				if(number==elementArray[row][column])
					return true;
			}
		}
		return false;
		
	}
}
