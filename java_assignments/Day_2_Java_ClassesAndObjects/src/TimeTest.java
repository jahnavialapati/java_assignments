import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class TimeTest {
	private Time time;
	private Time time1;
	private Time time2;
	private Time time3;
	@Before
	public void setUp(){
		time = new Time(10,20);
		time1 = new Time(16,60);
		time2 = new Time(7,60);
		time3 = new Time(7,40);
	}
	@Test
	public void test() {
		Time answer = Time.sumOfTime(time, time1);
		answer.displayTime();
		assertEquals("addition of hours shouldn't be more than 24 hours in a day", "addition of hours shouldn't be more than 24 hours in a day");
	}
	@Test
	public void test1() {
		Time answer = Time.sumOfTime(time2, time3);
		answer.displayTime();
		assertEquals("15 hrs 40 min",answer.hours+" hrs "+answer.minutes+" min");
	}
}