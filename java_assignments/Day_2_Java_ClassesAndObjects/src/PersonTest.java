import static org.junit.Assert.*;

import org.junit.Before;

import org.junit.Test;

public class PersonTest {
	private Person person,personOne;
	@Before
	public void setUp(){
		person = new Person("Ram",5,6,1980);
		personOne = new Person("Shyam",2,3,1987);
	}
	@Test
	public void olderOne() {
		String expected="Ram is older than Shyam by 6 years ,8 months, and 25days";
		String result =personOne.olderOne(person,personOne);
		assertEquals(expected,result);
	}
}