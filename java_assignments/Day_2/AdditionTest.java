import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class AdditionTest {
    
	private Calculator calculator;
	@Before
	public void setUp(){
		calculator=new Calculator();
	}
	@Test
	public void testForTwoPositiveNumbers() {
		int answer=calculator.addNumbers(50,50);
		assertEquals(100,answer);
	}
	@Test
	public void testForTwoNegativeNumbers() {
		int answer=calculator.addNumbers(-50,-50);
		assertEquals(-100,answer);
	}
	@Test
	public void testForOneNegativeNumber() {
		int answer=calculator.addNumbers(-50,50);
		assertEquals(0,answer);
	}
	@Test
	public void testForTwoZeros() {
		int answer=calculator.addNumbers(0,0);
		assertEquals(0,answer);
	}
	@Test
	public void testForOneZeroAndPostive() {
		int answer=calculator.addNumbers(0,50);
		assertEquals(50,answer);
	}
	public void testForOneZeroAndNegative() {
		int answer=calculator.addNumbers(0,50);
		assertEquals(50,answer);
	}

}
