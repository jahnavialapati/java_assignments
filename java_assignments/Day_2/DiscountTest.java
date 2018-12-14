import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class DiscountTest {
	Discount discount;
	@Before
	public void setUp(){
	discount=new Discount();
	}
	@Test
	public void test() {
		float result= discount.calculatePercentage(35000);
		assertEquals(22750.0,result,20);
	}

}
