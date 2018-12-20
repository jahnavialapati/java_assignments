import static org.junit.Assert.*;



import org.junit.Before;

import org.junit.Test;

public class CountryTest {
	Country countryOne;
    Country countryTwo;
	Country countryThree;
	@Before
	public void setUp(){
		countryOne=new Country("India",120000000,2476853);
		countryTwo=new Country("China",360000000,2287469);
		countryThree=new Country("America",9600000,3287469);
	}
	@Test
	public void countryWithLargestArea() {
		String expectedResult="America"; 
		String answer=Country.largestArea(countryOne,countryTwo,countryThree);
		assertEquals(expectedResult,answer);
	}
	@Test
	public void countryWithLargestPopulation() {
		String expectedResult="China";
		String answer=Country.largestPopulation(countryOne,countryTwo,countryThree);
		assertEquals(expectedResult,answer);
	}
	@Test
	public void countryWithLargestPopulationDensity(){
		String expectedResult="America";
		String answer=Country.largestDensity(countryOne,countryTwo,countryThree);
		assertEquals(expectedResult,answer);
	}
}