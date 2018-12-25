package com.cg.inheritance;

public class CorporateTraining extends Training{
	private int noOfDays;
	public CorporateTraining(String subject, int fees,int noOfDays) {
		super(subject, fees);
		this.noOfDays=noOfDays;
	}

	@Override
	public int getOrderValue() {	
		return getFees()*noOfDays;
	}
	
	
}
