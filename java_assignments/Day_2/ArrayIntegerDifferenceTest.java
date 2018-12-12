import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
public class ArrayIntegerDifferenceTest {
ArrayIntegerDifference integerDifference;
	@Before
	public void setUp() throws Exception {
		integerDifference=new ArrayIntegerDifference();
	}
	@Test
	public void test() {
		int[] numbers={5,9,6,8,7,1,6,3};
		int k=3;
		int actualOutput=integerDifference.findDifference(numbers,k);
		assertEquals(4, actualOutput);
	}
}
