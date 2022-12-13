package com.tns.framework;

public abstract class ShopAcc {
	protected int AccNo;
	protected String AccNm;
	protected float charges;
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		AccNo = accNo;
		AccNm = accNm;
		this.charges = charges;
	}
	public void bookProduct(float charges) {
		
	}
	public void items(float charges)
	{
		
	}
	@Override
	public String toString() {
		return "ShopAcc [AccNo=" + AccNo + ", AccNm=" + AccNm + ", charges=" + charges + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
}
