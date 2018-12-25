package com.cg.inheritance;

public class PublicTraining extends Training {
	private int noOfParticipants;
	public PublicTraining(String subject, int fee,int noOfParticipants) {
		super(subject, fee);
		this.noOfParticipants=noOfParticipants;
	}

	@Override
	public int getOrderValue() {
		return getFees()*noOfParticipants;
	}

	
}