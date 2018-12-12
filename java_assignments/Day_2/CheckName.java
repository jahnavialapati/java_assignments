
public class CheckName {
	public int findName(String name)
	{
		String namesArray[]={"Dave", "Ann", "George", "Sam", "Ted", "Gag", "Saj", "Agati", "Mary", "Sam", "Ayan", "Dev", "Kity", "Meery", "Smith", "Johnson", "Bill", "Williams", "Jones", "Brown", "Davis", "Miller", "Wilson", "Moore", "Taylor", "Anderson", "Thomas", "Jackson","Sam" };
		int count=0;
		for(int counter=0;counter<(namesArray.length);counter++)
		{
			if(name.equals(namesArray[counter]))
			{
				count++;
		    }		
		}
		return count;	
	}
}
