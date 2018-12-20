package com.cg.inheritance;

public abstract class Training {
	protected int studentId;
	private String subject;
	private int fees;
	public static int idGenerator;
	static{
		idGenerator=100;
	}
	{
		studentId=idGenerator++;
	}

	public Training(String subject, int fees) {
		this.subject = subject;
		this.fees = fees;
	}

	public String getSubject() {
		return this.subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public int getFees() {
		return this.fees;
	}

	public void setFees(int fees) {
		this.fees = fees;
	}
	
	public abstract int getOrderValue();

	@Override
	public String toString() {
		return "Training [studentId=" + studentId + ", subject=" + subject+ ", fees=" + fees + "]";
	}
	
}