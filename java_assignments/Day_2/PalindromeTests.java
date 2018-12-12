import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class PalindromeTests {
	private Palindrome palindromeTest;
	@Before
	public void setUp(){
		palindromeTest=new Palindrome();
	}
	@Test
	public void positiveNumber() {
		boolean result=palindromeTest.palindrome(121);
		assertEquals(true,result);
	}
	@Test
	public void negativeNumber() {
		boolean result=palindromeTest.palindrome(-121);
		assertEquals(false,result);
	}
	@Test
	public void thirdCase() {
		boolean result=palindromeTest.palindrome(10);
		assertEquals(false,result);
	}

}
