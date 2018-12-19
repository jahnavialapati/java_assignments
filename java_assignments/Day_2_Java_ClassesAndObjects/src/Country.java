
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
	
	/*public int getPopulation() {
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
	}*/

	public static String largestArea(Country country1, Country country2,Country country3) {
		Country result= new Country();
		if(country1.area>country2.area && country1.area>country3.area)
		{
			return country1.nameOfTheCountry;
		}
		else if(country2.area>country1.area && country2.area>country3.area)
		{
			return country2.nameOfTheCountry;
		}
		else
			return country3.nameOfTheCountry;
	}
	public static String largestPopulation(Country country1, Country country2,Country country3) {
		Country result=new Country();
		if(country1.population>country2.population && country1.population>country3.population)
		{
			return country1.nameOfTheCountry;
		}
		else if(country2.population>country1.population && country2.population>country3.population)
		{
			return country2.nameOfTheCountry;
		}
		else
			return country3.nameOfTheCountry;
		
	}
	
	
	
	
	 
}
