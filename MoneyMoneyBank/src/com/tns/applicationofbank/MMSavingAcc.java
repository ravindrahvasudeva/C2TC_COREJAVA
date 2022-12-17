package com.tns.applicationofbank;

import com.tns.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc {
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalary) 
	{
		super(accNo, accNm, accBal, isSalary);
	}
	public void withdraw(float accBal) {
		System.out.println("Dear Saving User,your Account Balance is="+" "+accBal+" "+"and credit limit is="+" "+getcreditLimit());
	}

	@Override
	public String toString() {
		return "MMSavingAcc [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
}
