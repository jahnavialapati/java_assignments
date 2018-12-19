import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class Date {
	private int date,month,year; 							
	public Date(int date, int month, int year) {			
		this.date = date;
		this.month = month;									 
		this.year = year;
	}

	public String toString(){																			
		return date+"/"+month+"/"+year;                      
	}

	public boolean isSmaller(Date date){					 
		Date givenDate = new Date(18,12,2019);
		if(date.date<givenDate.date)
		{												
			return true;
		}
		return false;                                         															
	}

	public int[] diff(Date date) 								
	{
		Date givenDate = new Date(18,12,2019);															
		int newDate = givenDate.date - date.date;
		int newMonth = givenDate.month - date.month;
		int newyear = givenDate.year - date.year;				
		int differences[] =	{newDate,newMonth,newyear};
		return differences;			                                                       											
	}
}
