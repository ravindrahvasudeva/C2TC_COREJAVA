package com.tns.framework;

public abstract class SavingAcc {
	private boolean isSalary;
	private static final float creditLimit=17000;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalary) {
		super();
		this.setSalary(isSalary);
	}
	public float getcreditLimit()
	{
		return creditLimit;
	}

	public void withdraw(float accBal) {
		
	}
	public boolean isSalary() {
		return isSalary;
	}

	public void setSalary(boolean isSalary) {
		this.isSalary = isSalary;
	}
	@Override
	public String toString() {
		return "SavingAcc [isSalary=" + isSalary + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
