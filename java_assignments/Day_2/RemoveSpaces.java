public class RemoveSpaces 
{
	public String identifyAndRemoveSpacesInString(String input, String wordToBeDeleted, int wordPositionInSentence) {
		StringBuffer stringbuffer=new StringBuffer();
		String[] splittedString=input.split("\\s+");
		for(int i=0;i<splittedString.length;i++)
		{
			if(!((i+1)==wordPositionInSentence && wordToBeDeleted.equals(splittedString[i])))
			{
				stringbuffer.append(splittedString[i]+" ");
			}
		}
		return stringbuffer.toString();
	}
}
