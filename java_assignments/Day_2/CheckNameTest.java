import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CheckNameTest {
	CheckName name;
	@Before
	public void setUp()
	{
		name=new CheckName();
	}
	@Test
	public void test() {
		int result=name.findName("Sam");
		assertEquals(3,result);
	}

}
