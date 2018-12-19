import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class CountryTest {
	Country country1;
    Country country2;
	Country country3;
	@Before
	public void setUp(){
		country1=new Country("India",120000000,2476853);
		country2=new Country("China",360000000,2287469);
		country3=new Country("America",9600000,3287469);
	}
	@Test
	public void countryWithLargestArea() {
		String expectedResult="America"; 
		String answer=Country.largestArea(country1,country2,country3);
		assertEquals(expectedResult,answer);
	}
	@Test
	public void countryWithLargestPopulation() {
		String expectedResult="China";
		String answer=Country.largestPopulation(country1,country2,country3);
		assertEquals(expectedResult,answer);
	}
	@Test
	public void countryWithLargestPopulationDensity(){
		
	}
}
