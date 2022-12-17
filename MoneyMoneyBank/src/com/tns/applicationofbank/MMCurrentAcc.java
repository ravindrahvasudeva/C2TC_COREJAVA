package com.tns.applicationofbank;

import com.tns.framework.CurrentAcc;

public class MMCurrentAcc extends  CurrentAcc{
	public MMCurrentAcc(int accNo, String accNm, float accBal) {
		super(accNo, accNm, accBal);
		
	}
	public void withdraw(float accBal) {
		System.out.println("Dear Current User,Your account Balance is="+" "+accBal+" "+"and credit limit is="+" "+getcreditLimit());
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
		
	

}
