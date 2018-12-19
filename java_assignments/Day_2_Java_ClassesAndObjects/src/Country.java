
public class Country {
	private String nameOfTheCountry;
	private int population;
    private double area;
	public Country(String nameOfTheCountry, int population, double area) {
		this.nameOfTheCountry=nameOfTheCountry;
		this.population=population;
		this.area=area;
	}
	public Country(){
		
	}
	
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}

	public static String largestArea(Country countryOne, Country countryTwo,Country countryThree) {
		if(countryOne.area>countryTwo.area && countryOne.area>countryThree.area)
		{
			return countryOne.nameOfTheCountry;
		}
		else if(countryTwo.area>countryThree.area)
		{
			return countryTwo.nameOfTheCountry;
		}
		else
			return countryThree.nameOfTheCountry;
	}
	
	public static String largestPopulation(Country countryOne, Country countryTwo,Country countryThree) {
		if(countryOne.population>countryTwo.population && countryOne.population>countryThree.population)
		{
			return countryOne.nameOfTheCountry;
		}
		else if(countryTwo.population>countryThree.population)
		{
			return countryTwo.nameOfTheCountry;
		}
		else
			return countryThree.nameOfTheCountry;
		
	}
	
	public static String largestDensity(Country countryOne, Country countryTwo,Country countryThree) {
		double countryOneDensity=countryOne.population/countryOne.area;
		double countryTwoDensity=countryTwo.population/countryTwo.area;
		double countryThreeDensity=countryThree.population/countryThree.area;
		if(countryOneDensity>countryTwoDensity && countryOneDensity>countryThreeDensity)
		{
			return countryOne.nameOfTheCountry;
		}
		else if(countryTwoDensity>countryThree.population)
		{
			return countryTwo.nameOfTheCountry;
		}
		else
			return countryThree.nameOfTheCountry;
	}	 
}
