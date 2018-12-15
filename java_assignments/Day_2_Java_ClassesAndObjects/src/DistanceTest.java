import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class DistanceTest {
	private Distance distance;
	private Distance distance1;
	@Before
	public void setUp(){
		distance = new Distance(4.0f,6.0f);
		distance1 = new Distance(5.7f,6.7f);
	}
	@Test
	public void test() {
		String expected="9.7 ft 12.7 in";
		Distance answer = Distance.sum(distance, distance1);
		answer.display();
		assertEquals(expected, answer.feet+" ft "+answer.inches+" in");
	}
}
