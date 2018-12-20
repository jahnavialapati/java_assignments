package com.cg.inheritance;

public class CorporateTraining extends Training{

	public CorporateTraining(String subject, int fees) {
		super(subject, fees);
	}

	@Override
	public int getOrderValue() {
		int noOfDays=4;
		return getFees()*noOfDays;
	}
	
	
}
