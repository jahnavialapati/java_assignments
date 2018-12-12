import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CheckNumberMultiDimensionalTest {
	CheckNumberMultiDimensional number1;
	@Before
	public void setUp()
	{
		number1=new CheckNumberMultiDimensional();
	}
	@Test
	public void findNumber() {
		boolean answer=number1.checkNumber(4);
		assertEquals(true,answer);
	}

}
