package com.tns.framework;

public abstract class PrimeAcc {
	protected boolean isPrime;
	protected float deliverycharges=0;
	public void bookProduct(float charges) {
		
	}
	public PrimeAcc(boolean isPrime) {
		super();
		this.isPrime = isPrime;
	}
	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
}
