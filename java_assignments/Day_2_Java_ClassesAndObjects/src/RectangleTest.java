import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
public class RectangleTest {
	private Rectangle rectangle;
	private Rectangle rectangle1;
	@Before
	public void setUp()
	{
		rectangle = new Rectangle(20,10);
		rectangle1 = new Rectangle(20,15);	
	}
	@Test
	public void area() {
		double area=rectangle.area();
		double area1=rectangle1.area();
		assertEquals(200,area,00);
		assertEquals(300,area1,00);
	}
	@Test
	public void perimeter() {
		double perimeter=rectangle.perimeter();
		double perimeter1=rectangle1.perimeter();
		assertEquals(60,perimeter,00);
		assertEquals(70,perimeter1,00);
	}
	@Test
	public void lengthOfDiagonal() {
		double lengthOfDiagonal=rectangle.lengthOfDiagonal();
		double lengthOfDiagonal1=rectangle1.lengthOfDiagonal();
		assertEquals(22.360679774997898,lengthOfDiagonal,00);
		assertEquals(25,lengthOfDiagonal1,00);
	}
	@Test
	public void objectCompare() {
		boolean compare = Rectangle.areaCompare(rectangle,rectangle1);
		assertEquals(false,compare);
	}
}