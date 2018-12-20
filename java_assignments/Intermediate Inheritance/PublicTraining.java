package com.cg.inheritance;

public class PublicTraining extends Training {
	
	public PublicTraining(String subject, int fee) {
		super(subject, fee);
	}

	@Override
	public int getOrderValue() {
		int noOfParticipants=50;
		return getFees()*noOfParticipants;
	}

	
}