import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class FindDuplicatesTest {
	FindDuplicates removeDuplicates;
	@Before
	public void setUp() throws Exception {
		removeDuplicates=new FindDuplicates();
	}
	@Test
	public void test1() {
		String input="abcabcabc";
		String actual=removeDuplicates.findDuplicates(input);
		String expected="abc";
		assertEquals(expected, actual);
	}
	@Test
	public void test2() {
		String input="javaforschool";
		String actual=removeDuplicates.findDuplicates(input);
		String expected="javforschl";
		assertEquals(expected, actual);
	}
	@Test
	public void test3() {
		String input="Mississippi";
		String actual=removeDuplicates.findDuplicates(input);
		String expected="Misp";
		assertEquals(expected, actual);
	}
}