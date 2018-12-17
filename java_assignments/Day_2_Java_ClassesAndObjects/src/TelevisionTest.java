import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class TelevisionTest {
	Television television;
	Television television1;
	@Before
	public void setUp()
	{
		television=new Television();
		television1=new Television();
	}
	/*@Test
	public void stateOn() {
		boolean result=television.setState(true);
		System.out.println(result);
		assertEquals(false,result);
	}*/
	@Test
	public void stateOff() {
		boolean result=television1.setState(true);
		assertEquals(false,result);
	}
	@Test 
	public void increaseVolume2(){
		int result=television1.increaseVolume();
		//assertEquals(true,television1.setState(false));
		assertEquals(1,result);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	public void increaseVolume1(){
		int result=television1.setCurrentVolume();
		assertEquals(6,result);
	}
	/*@Test
	public void increaseVolume1(){
		int result=television1.setCurrentVolume(6);
		assertEquals(6,result);
	}
	@Test
	public void decreaseVolume(){
		int result=television1.setCurrentVolume(2);
		assertEquals(2,result);
	}
	@Test
	public void LimitVolume(){
	   int result=television.setCurrentVolume(11);
		assertEquals("It cannot be greater than 10",0,result);
	}*/

	/*@Test
	public void channel(){
		String result=television.changeChannel("colors");
		System.out.println(result);
		assertEquals("colors",result);
	
	}*/
}
