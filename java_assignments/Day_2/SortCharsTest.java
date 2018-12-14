import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class SortCharsTest {
	SortChars palindromeSort;
	@Before
	public void setUp()
	{
		palindromeSort=new SortChars();
	}
	@Test
	public void sortedPalindromeArray()
	{
		String[] inputArray={"janu","amma","dad","mam","nitin","ram"};
		String[] result=palindromeSort.palindrome(inputArray);
		String[] expected={"dad","mam","amma","nitin"};
		assertArrayEquals(expected, result);
	}

}
