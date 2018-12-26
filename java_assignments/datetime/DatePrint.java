package com.cg.datetime;

public class DatePrint {
	public String isString(String date) {
		int length=date.length();
		String day,month,year;
		int maxdays[]={0,31,28,31,30,31,30,31,31,30,31,30,31}; 
		String monthArray[]={ "", "January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December" };
		int days=0,months=0,years=0;
			 day=date.substring(0,2); 
			 month= date.substring(2,4); 
             year= date.substring(4); 
             days=Integer.valueOf(day);
             months=Integer.valueOf(month);
             years=Integer.valueOf(year);
             if((years%400==0) || ((years%100!=0)&&(years%4==0))) 
             {
                 maxdays[2]=29;
             }
             return days+"/"+months+"/"+years+"\n"+days+" "+monthArray[months]+", "+years;
		}
}
